package com.hasanshukurov.gomrukquiz.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.core.content.ContextCompat
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!


    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        supportActionBar?.hide()
        getWindow().setStatusBarColor(ContextCompat.getColor(this@MainActivity,R.color.white))

        FirebaseApp.initializeApp(this@MainActivity)

        auth = Firebase.auth
        val currentUser = auth.currentUser

        if (currentUser != null) {
            val intent = Intent(this@MainActivity, QuizActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnLogin.setOnClickListener{
            val intent = Intent(this@MainActivity, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.btnSignup.setOnClickListener{
            val intent = Intent(this@MainActivity, SignUpActivity::class.java)
            startActivity(intent)
        }


    }




    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}