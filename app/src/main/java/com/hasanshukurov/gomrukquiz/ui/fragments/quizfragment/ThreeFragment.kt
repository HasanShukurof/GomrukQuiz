package com.hasanshukurov.gomrukquiz.ui.fragments.quizfragment

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.FragmentThreeBinding
import com.hasanshukurov.gomrukquiz.databinding.FragmentTwoBinding
import com.hasanshukurov.gomrukquiz.model.QuestionModel
import com.hasanshukurov.gomrukquiz.ui.activities.ResultActivity
import com.hasanshukurov.gomrukquiz.util.Constants
import com.hasanshukurov.gomrukquiz.util.ListThree
import com.hasanshukurov.gomrukquiz.util.ListTwo

class ThreeFragment : Fragment(), View.OnClickListener {

    private var _binding: FragmentThreeBinding? = null
    private val binding: FragmentThreeBinding get() = _binding!!


    private var progressBar: ProgressBar?=null
    private var tvProgress: TextView? = null
    private var tvQuestion: TextView? = null
    private var tvOptionOne: TextView? = null
    private var tvOptionTwo: TextView? = null
    private var tvOptionThree: TextView? = null
    private var tvOptionFour: TextView? = null
    private var buttonSubmit: Button? = null

    private var currentPosition:Int = 0
    private val questionsList:ArrayList<QuestionModel> = arrayListOf()
    private var correctAnswers:Int = 0
    private var userName:String  = ""
    private var selectedOptionPosition:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentThreeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        (requireActivity() as AppCompatActivity).supportActionBar?.hide()




        progressBar = binding.progressBar
        tvProgress = binding.tvProgress
        tvQuestion = binding.tvQuestion
        tvOptionOne = binding.tvOptionOne
        tvOptionTwo = binding.tvOptionTwo
        tvOptionThree = binding.tvOptionThree
        tvOptionFour = binding.tvOptionFour
        buttonSubmit = binding.btnSubmit
        questionsList.addAll(ListThree.getListThree())



        setQuestion()

        tvOptionOne?.setOnClickListener(this)
        tvOptionTwo?.setOnClickListener(this)
        tvOptionThree?.setOnClickListener(this)
        tvOptionFour?.setOnClickListener(this)
        buttonSubmit?.setOnClickListener (this)
    }

    private fun setQuestion() {

        val question:QuestionModel = questionsList[currentPosition]
        defaultOptionsView()
        if (currentPosition <= questionsList.size - 1 ){
            buttonSubmit?.text = "Cavabla"
        }

        progressBar?.progress = currentPosition
        progressBar?.getProgressDrawable()?.setColorFilter(
            Color.WHITE, android.graphics.PorterDuff.Mode.SRC_IN)
        progressBar?.max = 10
        tvProgress?.text = "${currentPosition+1} / ${progressBar?.max}"

        tvQuestion?.text = question.question
        tvOptionOne?.text = question.optionOne
        tvOptionTwo?.text = question.optionTwo
        tvOptionThree?.text = question.optionThree
        tvOptionFour?.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = ArrayList<TextView>()
        tvOptionOne?.let {
            options.add(0, it)
        }
        tvOptionTwo?.let {
            options.add(1, it)
        }
        tvOptionThree?.let {
            options.add(2, it)
        }
        tvOptionFour?.let {
            options.add(3,it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#FF000000"))
            option.typeface = Typeface.DEFAULT
            option.background = ResourcesCompat.getDrawable(
                resources,R.drawable.default_option_border_bg,null)

        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionsView()

        selectedOptionPosition = selectedOptionNum

        tv.setTextColor(
            Color.parseColor("#363A43")
        )
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ResourcesCompat.getDrawable(
            resources,R.drawable.selected_option_border_bg,null)
    }

    private fun answerView(answer: Int, drawableView: Int) {

        when (answer) {

            1 -> {
                tvOptionOne?.background = ResourcesCompat.getDrawable(
                    resources, drawableView,null )
            }
            2 -> {
                tvOptionTwo?.background = ResourcesCompat.getDrawable(
                    resources, drawableView,null )
            }
            3 -> {
                tvOptionThree?.background = ResourcesCompat.getDrawable(
                    resources, drawableView,null )
            }
            4 -> {
                tvOptionFour?.background = ResourcesCompat.getDrawable(
                    resources, drawableView,null )
            }
        }
    }

    override fun onClick(view: View) {
        when(view.id){
            tvOptionOne?.id -> {
                tvOptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }

            tvOptionTwo?.id->{
                tvOptionTwo?.let {
                    selectedOptionView(it,2)
                }
            }

            tvOptionThree?.id ->{
                tvOptionThree?.let {
                    selectedOptionView(it,3)
                }
            }

            tvOptionFour?.id ->{
                tvOptionFour?.let {
                    selectedOptionView(it,4)
                }
            }
            buttonSubmit?.id->{

                if (selectedOptionPosition == 0) {

                    currentPosition++

                    when {

                        currentPosition <= questionsList.size - 1  -> {

                            setQuestion()
                        }
                        else -> {

                            requireActivity().apply {
                                val intent =
                                    Intent(this, ResultActivity::class.java)
                                intent.putExtra(Constants.CORRECT_ANSWERS, correctAnswers)
                                intent.putExtra(Constants.TOTAL_QUESTIONS, questionsList.size)
                                startActivity(intent)
                                finish()
                            }
                        }
                    }
                } else {
                    val question = questionsList[currentPosition]

                    // This is to check if the answer is wrong
                    if (question.correctAnswer != selectedOptionPosition) {
                        answerView(selectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }else{
                        correctAnswers++
                    }

                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (currentPosition == questionsList.size-1) {
                        buttonSubmit?.text = "Bitir"
                    } else {
                        buttonSubmit?.text = "Növbəti Sual"
                    }

                    selectedOptionPosition = 0
                }
            }
        }
    }






    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}