package com.example.e_commerce.service

import com.example.e_commerce.data.models.UserLogin
import com.example.e_commerce.data.models.UserRegister
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult

interface AuthService {

    fun userregister(user: UserRegister): Task<AuthResult>

    fun userlogin(user: UserLogin): Task<AuthResult>

}