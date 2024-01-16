package com.hasanshukurov.gomrukquiz.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.ActivitySignUpBinding
import com.hasanshukurov.gomrukquiz.util.Constants

class SignUpActivity : AppCompatActivity() {

    private var _binding: ActivitySignUpBinding? = null
    private val binding: ActivitySignUpBinding get() = _binding!!

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySignUpBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        auth = Firebase.auth

        signUp()

        supportActionBar?.hide()
        getWindow().setStatusBarColor(ContextCompat.getColor(this@SignUpActivity, R.color.blue))

        binding.logInTextView.setOnClickListener {
            val intent = Intent(this@SignUpActivity,SignInActivity::class.java)
            startActivity(intent)
        }

    }

    private fun signUp(){

        binding.btnSignUp.setOnClickListener {

            var name = binding.nameText.text.toString()
            val email = binding.emailText.text.toString()
            val password = binding.passwordText.text.toString()

            

            if (name.isEmpty()|| email.isEmpty() || password.isEmpty()){
                Toast.makeText(this@SignUpActivity,"Bosh Xanaları Doldurun",Toast.LENGTH_SHORT).show()
            }else{
                auth.createUserWithEmailAndPassword(email,password).addOnSuccessListener {
                    val intent = Intent(this@SignUpActivity,QuizActivity::class.java)
                    startActivity(intent)
                    finish()
                }.addOnFailureListener {
                    Toast.makeText(this@SignUpActivity,it.localizedMessage,Toast.LENGTH_SHORT).show()
                }
            }
        }
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}