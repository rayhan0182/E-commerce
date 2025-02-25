package com.example.e_commerce.view.starter

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentStartBinding

class startFragment : Fragment() {

    lateinit var binding: FragmentStartBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentStartBinding.inflate(inflater,container,false)

        clickListener()

        return binding.root

    }

    private fun clickListener() {


        with(binding){

            login.setOnClickListener {


                findNavController().navigate(R.id.action_startFragment_to_logFragment)


            }

            signup.setOnClickListener {

                findNavController().navigate(R.id.action_startFragment_to_signFragment)

            }



        }




    }


}