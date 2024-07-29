package com.hasanshukurov.gomrukquiz.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.QuizRowBinding
import com.hasanshukurov.gomrukquiz.model.QuestionModel
import com.hasanshukurov.gomrukquiz.model.QuizModel
import com.hasanshukurov.gomrukquiz.model.RvModel
import com.hasanshukurov.gomrukquiz.ui.fragments.HomeFragmentDirections
import com.hasanshukurov.gomrukquiz.util.ListFour
import com.hasanshukurov.gomrukquiz.util.ListOne
import com.hasanshukurov.gomrukquiz.util.ListThree
import com.hasanshukurov.gomrukquiz.util.ListTwo

class QuizAdapter(val packetList: ArrayList<QuizModel>) :
    RecyclerView.Adapter<QuizAdapter.QuizHolder>() {
    class QuizHolder(val binding: QuizRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuizHolder {
        val binding = QuizRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return QuizHolder(binding)
    }

    override fun onBindViewHolder(holder: QuizHolder, position: Int) {

        holder.binding.packetName.text = packetList[position].quizName

        holder.binding.cardView.setOnClickListener {

            val bundleOne = Bundle().apply {
                putSerializable("questionListArg", packetList[position].question)
            }
            Navigation.findNavController(it)
                .navigate(R.id.action_homeFragment2_to_oneFragment, bundleOne)

        }
    }

    override fun getItemCount(): Int {
        return packetList.size
    }
}