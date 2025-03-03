package com.example.e_commerce.view.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.e_commerce.data.models.Login
import com.example.e_commerce.databinding.FragmentLogBinding
import com.example.e_commerce.isEmpty
import com.example.e_commerce.view.sign.RegistrationViewModel

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

               password.isEmpty()


               if (!email.isEmpty() && !password.isEmpty()){

                val luser = Login(email.text.toString(),password.text.toString())

                RegistrationViewModel().userlogin(luser)




               }

           }


        }


    }


}