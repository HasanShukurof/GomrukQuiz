package com.hasanshukurov.gomrukquiz.ui.fragments

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.adapter.QuizAdapter
import com.hasanshukurov.gomrukquiz.databinding.FragmentHomeBinding
import com.hasanshukurov.gomrukquiz.model.QuestionModel
import com.hasanshukurov.gomrukquiz.model.QuizModel
import com.hasanshukurov.gomrukquiz.model.RvModel
import com.hasanshukurov.gomrukquiz.ui.activities.MainActivity
import com.hasanshukurov.gomrukquiz.ui.activities.QuizActivity
import com.hasanshukurov.gomrukquiz.util.ListFour
import com.hasanshukurov.gomrukquiz.util.ListOne
import com.hasanshukurov.gomrukquiz.util.ListThree
import com.hasanshukurov.gomrukquiz.util.ListTwo

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    private lateinit var adapter: QuizAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity() as AppCompatActivity).supportActionBar?.show()
   //     (requireActivity() as AppCompatActivity).supportActionBar?.setBackgroundDrawable(ResourcesCompat.getDrawable(resources,R.drawable.correct_option_border_bg,null))
        (requireActivity() as AppCompatActivity).supportActionBar?.title = ""



        val packetList = ArrayList<RvModel>()

        val packetOne = RvModel("Quiz - 1")
        val packetTwo = RvModel("Quiz - 2")
        val packetThree = RvModel("Quiz - 3")
        val packetFour = RvModel("Quiz - 4")



        packetList.add(packetOne)
        packetList.add(packetTwo)
        packetList.add(packetThree)
        packetList.add(packetFour)

        val quizList = ArrayList<QuizModel>()
        quizList.add(QuizModel("Quiz-1", ListOne.getListOne()))
        quizList.add(QuizModel("Quiz-2", ListTwo.getListTwo()))
        quizList.add(QuizModel("Quiz-3", ListThree.getListThree()))
        quizList.add(QuizModel("Quiz-2", ListFour.getListFour()))


        binding.rv.layoutManager = LinearLayoutManager(requireContext())
        adapter = QuizAdapter(quizList)
        binding.rv.adapter = adapter


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}