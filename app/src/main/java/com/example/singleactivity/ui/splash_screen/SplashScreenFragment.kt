package com.example.intuzaeat.ui.splash_screen

import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.singleactivity.R
import com.example.singleactivity.databinding.FragmentSplashScreenBinding

class SplashScreenFragment : Fragment(R.layout.fragment_splash_screen) {

    lateinit var binding: FragmentSplashScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSplashScreenBinding.bind(view)

        Handler().postDelayed( Runnable {
            findNavController().navigate(R.id.action_splashScreenFragment_to_mainFragment)
            Log.d("TAG", "postDelayed: ")
        }, 2000)
    }
}