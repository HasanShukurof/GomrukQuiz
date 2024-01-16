package com.hasanshukurov.gomrukquiz.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.firebase.FirebaseApp
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {

    private var _binding: ActivitySignInBinding? = null
    private val binding: ActivitySignInBinding get() = _binding!!

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignInBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        supportActionBar?.hide()
        getWindow().setStatusBarColor(ContextCompat.getColor(this@SignInActivity, R.color.blue))

        FirebaseApp.initializeApp(this)

        auth = Firebase.auth

        signIn()


        binding.signUpTextView.setOnClickListener {
            val intent = Intent(this@SignInActivity, SignUpActivity::class.java)
            startActivity(intent)
        }




    }

    private fun signIn(){
        binding.btnLogin.setOnClickListener {
            val email = binding.emailText.text.toString()
            val password = binding.passwordText.text.toString()

            if (email.equals("") || password.equals("")) {
                Toast.makeText(this@SignInActivity,"Mail və Şifrə girin", Toast.LENGTH_LONG).show()
            }else {
                auth.signInWithEmailAndPassword(email,password).addOnSuccessListener {
                    val intent = Intent(this@SignInActivity, QuizActivity::class.java)
                    startActivity(intent)
                    finish()
                }.addOnFailureListener {
                    Toast.makeText(this,it.localizedMessage, Toast.LENGTH_LONG).show()
                }

            }
        }
    }




    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}