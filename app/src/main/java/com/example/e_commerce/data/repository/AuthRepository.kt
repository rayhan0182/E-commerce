package com.example.e_commerce.data.repository

import com.example.e_commerce.data.models.UserLogin
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.service.AuthService
import com.google.android.gms.tasks.Task
import com.google.firebase.Firebase
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import java.security.AuthProvider

class AuthRepository : AuthService {


    override fun userregister(user: UserRegister): Task<AuthResult> {

        val create_auth = FirebaseAuth.getInstance()

        return create_auth.createUserWithEmailAndPassword(user.email, user.password)

    }

    override fun userlogin(user: UserLogin): Task<AuthResult> {

        val create_auth = FirebaseAuth.getInstance()

      return  create_auth.signInWithEmailAndPassword(user.email,user.pass)

    }


}