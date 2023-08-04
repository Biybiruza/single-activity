package com.example.intuzaeat.ui.review

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.example.singleactivity.R
import com.example.singleactivity.databinding.FragmentReviewBinding

class ReviewFragment : Fragment(R.layout.fragment_review) {

    private lateinit var binding: FragmentReviewBinding
    lateinit var navController: NavController

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentReviewBinding.bind(view)

        navController = Navigation.findNavController(requireActivity(),R.id.fragmentContainerView)

        binding.tvReview.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_settingFragment)
        }
    }

}