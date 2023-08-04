package com.example.intuzaeat.ui.mainFragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.singleactivity.R
import com.example.singleactivity.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding
    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)
        navController = Navigation.findNavController(requireActivity(),R.id.fragment)

        binding.apply {
            bottomNav.setupWithNavController(navController)
        }
    }
}