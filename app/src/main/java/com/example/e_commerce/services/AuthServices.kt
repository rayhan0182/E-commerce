package com.example.e_commerce.services

import com.example.e_commerce.data.models.Login
import com.example.e_commerce.data.models.UserRegister
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthServices {


    fun userRegistration(user:UserRegister):Task<AuthResult>

    fun userLogin(luser:Login):Task<AuthResult>


}