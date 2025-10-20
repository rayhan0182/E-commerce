package com.example.e_commerce.View

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.R
import com.example.e_commerce.databinding.FragmentSignupBinding
import com.example.e_commerce.isempty

class SignupFragment : Fragment() {
    lateinit var binding: FragmentSignupBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignupBinding.inflate(inflater,container,false)

        Clickevent()

        return binding.root
    }

    private fun Clickevent() {

        with(binding){

            clickSave.setOnClickListener {

                if (name.isempty()!=true&&email.isempty()!=true&&pass.isempty()!=true){

                    Toast.makeText(context,"value fillup done", Toast.LENGTH_LONG).show()

                }



            }

            haveAcc.setOnClickListener {


                findNavController().navigate(R.id.action_signupFragment_to_loginFragment)

            }


        }



    }


}