package com.hasanshukurov.gomrukquiz.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.QuizRowBinding
import com.hasanshukurov.gomrukquiz.model.QuestionModel
import com.hasanshukurov.gomrukquiz.model.RvModel
import com.hasanshukurov.gomrukquiz.ui.fragments.HomeFragmentDirections
import com.hasanshukurov.gomrukquiz.util.ListFour
import com.hasanshukurov.gomrukquiz.util.ListOne
import com.hasanshukurov.gomrukquiz.util.ListThree
import com.hasanshukurov.gomrukquiz.util.ListTwo

class QuizAdapter(val packetList: ArrayList<RvModel>) :
    RecyclerView.Adapter<QuizAdapter.QuizHolder>() {
    class QuizHolder(val binding: QuizRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizHolder {
        val binding = QuizRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuizHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizHolder, position: Int) {

        holder.binding.packetName.text = packetList[position].packetName

        holder.binding.cardView.setOnClickListener {

            when (position) {
                0 -> {
                    val listOne = ListOne.getListOne()
                    val bundleOne = Bundle().apply {
                        putSerializable("questionListArg",listOne)
                    }
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment2_to_oneFragment,bundleOne)
                }
                1 -> {
                    val listSecond = ListTwo.getListTwo()
                    val bundleSecond = Bundle().apply {
                        putSerializable("questionListArg",listSecond)
                    }
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment2_to_oneFragment,bundleSecond)
                }
                2 -> {
                    val listThirt = ListThree.getListThree()
                    val bundleThirt = Bundle().apply {
                        putSerializable("questionListArg",listThirt)
                    }
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment2_to_oneFragment,bundleThirt)
                }
                3 -> {
                    val listFour = ListFour.getListFour()
                    val bundleFour = Bundle().apply {
                        putSerializable("questionListArg",listFour)
                    }
                    Navigation.findNavController(it)
                        .navigate(R.id.action_homeFragment2_to_oneFragment,bundleFour)
                }
            }

        }
    }

    override fun getItemCount(): Int {
        return packetList.size
    }
}