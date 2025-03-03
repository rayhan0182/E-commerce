package com.example.e_commerce.view.sign

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.e_commerce.data.models.Login
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.data.repository.AuthRepository

class RegistrationViewModel : ViewModel() {

    fun userdata(user: UserRegister) {


        val authservice = AuthRepository()

        authservice.userRegistration(user).addOnSuccessListener {

            Log.d("TAG", "userdata: success")

        }.addOnFailureListener { error ->

            Log.d("TAG", "userdata: ${error.message}")


        }


    }


    fun userlogin(ulogin:Login){

        val lj = AuthRepository()

        lj.userLogin(ulogin).addOnSuccessListener {


            Log.d("TAG", "userlogin: success")

        }.addOnFailureListener {error->

            Log.d("TAG", "userlogin: ${error.message}")

        }


    }





    }





