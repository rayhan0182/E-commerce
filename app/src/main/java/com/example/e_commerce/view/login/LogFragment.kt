package com.example.e_commerce.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentLogBinding
import com.example.e_commerce.isEmpty

class logFragment : Fragment() {

    lateinit var binding: FragmentLogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentLogBinding.inflate(inflater,container,false)

        logclicklistener()

        return binding.root


    }

    private fun logclicklistener() {

        with(binding){

           logbtn.setOnClickListener {


               email.isEmpty()

               email.isEmpty()


               if (!email.isEmpty() && !password.isEmpty()){

                Toast.makeText(context,"successfully execute",Toast.LENGTH_LONG).show()


               }

           }


        }


    }


}