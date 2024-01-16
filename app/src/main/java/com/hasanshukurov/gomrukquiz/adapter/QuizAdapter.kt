package com.hasanshukurov.gomrukquiz.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.hasanshukurov.gomrukquiz.databinding.QuizRowBinding
import com.hasanshukurov.gomrukquiz.model.RvModel
import com.hasanshukurov.gomrukquiz.ui.fragments.quizfragment.HomeFragmentDirections

class QuizAdapter(val packetList: ArrayList<RvModel>): RecyclerView.Adapter<QuizAdapter.QuizHolder>() {
    class QuizHolder(val binding: QuizRowBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizHolder {
        val binding = QuizRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return QuizHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizHolder, position: Int) {

        holder.binding.packetName.text = packetList[position].packetName

        holder.binding.cardView.setOnClickListener {

            when(position){
                0 ->{
                    Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragment2ToOneFragment())
                }
                1 ->{
                    Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragment2ToTwoFragment())
                }
                2 ->{
                    Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragment2ToThreeFragment())
                }
                3 ->{
                    Navigation.findNavController(it).navigate(HomeFragmentDirections.actionHomeFragment2ToFourFragment())
                }
            }

        }
    }

    override fun getItemCount(): Int {
        return packetList.size
    }
}