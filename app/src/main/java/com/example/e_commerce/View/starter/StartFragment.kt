package com.example.e_commerce.View.starter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentStartBinding

class StartFragment : Fragment() {
    lateinit var binding: FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding  = FragmentStartBinding.inflate(inflater,container,false)

        setOnclik()



        return binding.root
    }

    private fun setOnclik() {

        with(binding){

            this.logIn.setOnClickListener {

                findNavController().navigate(R.id.action_startFragment_to_loginFragment)

            }

            this.signUp.setOnClickListener {

                findNavController().navigate(R.id.action_startFragment_to_signupFragment)

            }


        }



    }


}