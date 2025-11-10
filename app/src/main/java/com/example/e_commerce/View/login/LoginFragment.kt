package com.example.e_commerce.View.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.e_commerce.Core.Datastate
import com.example.e_commerce.R
import com.example.e_commerce.base.BaseFragment
import com.example.e_commerce.data.models.UserLogin
import com.example.e_commerce.databinding.FragmentLoginBinding
import com.example.e_commerce.isempty

class LoginFragment : BaseFragment<FragmentLoginBinding>(FragmentLoginBinding::inflate) {

    private val viewmodel: LoginViewmodel by viewModels()

    override fun createuser() {

        with(binding) {

            clickSave.setOnClickListener {

                if (!email.isempty() && !pass.isempty()) {


                    val logindata =
                        UserLogin(email.text.toString(), pass.text.toString(), "", "customer")

                    viewmodel.createlogin(logindata)


                } else {

                    Toast.makeText(context, "fillup all input box", Toast.LENGTH_LONG).show()

                }


            }

            NoAcc.setOnClickListener {

                findNavController().navigate(R.id.action_loginFragment_to_signupFragment)


            }


        }


    }

    override fun observer() {

        viewmodel.login_respons.observe(viewLifecycleOwner) { it ->

            when (it) {

                is Datastate.Error -> {


                    loading.dismiss()

                    Toast.makeText(context, "${it.massage}", Toast.LENGTH_LONG).show()

                }

                is Datastate.Loading -> {

                    loading.show()

                    Toast.makeText(context, "Loading..", Toast.LENGTH_LONG).show()

                }

                is Datastate.Success -> {

                    loading.dismiss()

                    Toast.makeText(context, "success: ${it.data}", Toast.LENGTH_LONG).show()


                }
            }


        }


    }


}