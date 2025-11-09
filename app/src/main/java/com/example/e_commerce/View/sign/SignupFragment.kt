package com.example.e_commerce.View.sign

import android.annotation.SuppressLint
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
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.databinding.FragmentSignupBinding
import com.example.e_commerce.isempty

class SignupFragment : BaseFragment<FragmentSignupBinding>(FragmentSignupBinding::inflate) {

    private val viewmodel: Registerviewmodel by viewModels()


    override fun createuser() {

        with(binding) {

            clickSave.setOnClickListener {


                if (!name.isempty() && !email.isempty() && !pass.isempty()) {

                    val create = UserRegister(
                        name.text.toString(),
                        email.text.toString(),
                        pass.text.toString(),
                        "seller",
                        ""
                    )

                    viewmodel.registervm(create)


                } else {

                    Toast.makeText(requireContext(), "Please fill all fields", Toast.LENGTH_SHORT)
                        .show()

                }


            }

            haveAcc.setOnClickListener {


                findNavController().navigate(R.id.action_signupFragment_to_loginFragment)

            }


        }

    }

    override fun observer() {

        viewmodel.mlivedata.observe(viewLifecycleOwner) { it ->

            // OOAD (object oriented analysis design)

            when (it) {
                is Datastate.Error -> {

                    loading.dismiss()

                    Toast.makeText(context, it.massage.toString(), Toast.LENGTH_SHORT).show()

                }

                is Datastate.Loading -> {

                    loading.show()

                    Toast.makeText(context, "Loading...", Toast.LENGTH_SHORT).show()


                }

                is Datastate.Success -> {

                    loading.dismiss()

                    Toast.makeText(context, "Success:$it", Toast.LENGTH_SHORT).show()
                }
            }


        }

    }


}