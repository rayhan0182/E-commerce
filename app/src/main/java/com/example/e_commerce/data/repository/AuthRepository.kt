package com.example.e_commerce.data.repository

import com.example.e_commerce.data.models.Login
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.services.AuthServices
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth

class AuthRepository : AuthServices {
    override fun userRegistration(user: UserRegister): Task<AuthResult> {

        val jAuth = FirebaseAuth.getInstance()

        return jAuth.createUserWithEmailAndPassword(user.email, user.password)


    }

    override fun userLogin(luser: Login): Task<AuthResult> {

        val LAuth = FirebaseAuth.getInstance()

       return LAuth.createUserWithEmailAndPassword(luser.usermail,luser.userpassword)

    }


}