package com.hasanshukurov.gomrukquiz.ui.fragments.authfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.hasanshukurov.gomrukquiz.R
import com.hasanshukurov.gomrukquiz.databinding.FragmentHomeBinding
import com.hasanshukurov.gomrukquiz.databinding.FragmentStartBinding


class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding: FragmentStartBinding get() = _binding!!

    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentStartBinding.inflate(inflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        auth = Firebase.auth





        binding.btnLogin.setOnClickListener {
     //       findNavController().navigate(StartFragmentDirections.actionStartFragmentToLoginFragment())
        }

        binding.btnSignup.setOnClickListener {
      //      findNavController().navigate(StartFragmentDirections.actionStartFragmentToSignupFragment())
        }


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}