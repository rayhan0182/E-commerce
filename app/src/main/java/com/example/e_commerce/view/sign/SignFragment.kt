package com.example.e_commerce.view.sign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isEmpty
import com.example.e_commerce.R
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.databinding.FragmentSignBinding
import com.example.e_commerce.isEmpty


class signFragment : Fragment() {

    lateinit var binding: FragmentSignBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSignBinding.inflate(inflater, container, false)

        setOnclicklistner()

        return binding.root
    }

    private fun setOnclicklistner() {

        with(binding) {

            signbtn.setOnClickListener {

                username.isEmpty()

                useremail.isEmpty()

                userpassword.isEmpty()

                if (!username.isEmpty() && !useremail.isEmpty() && !userpassword.isEmpty()) {

                    val user = UserRegister(

                        username.text.toString(),

                        useremail.text.toString(),

                        userpassword.text.toString(),

                        "seller",

                        ""

                    )

                    val data = RegistrationViewModel().userdata(user)


                }


            }

        }

    }


}