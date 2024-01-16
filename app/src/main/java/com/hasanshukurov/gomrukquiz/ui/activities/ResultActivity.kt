package com.hasanshukurov.gomrukquiz.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.ActivityQuizBinding
import com.hasanshukurov.gomrukquiz.databinding.ActivityResultBinding
import com.hasanshukurov.gomrukquiz.util.Constants

class ResultActivity : AppCompatActivity() {

    private var _binding: ActivityResultBinding? = null
    private val binding: ActivityResultBinding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityResultBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()






        val userScore = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val scorePercent = (userScore * 100) / totalQuestions

        binding.tvQuestionSize.text = "Toplam Sual Sayı: $totalQuestions"
        binding.tvCorrectQuestionsSize.text = "Doğru Cavabların Sayı: $userScore"
        binding.tvTotalPercent.text = "Göstərici: $scorePercent %"


        binding.btnFinish.setOnClickListener {
            val intent = Intent(this@ResultActivity, QuizActivity::class.java)
            startActivity(intent)
            finish()
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}