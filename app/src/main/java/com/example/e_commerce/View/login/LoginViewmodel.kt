package com.example.e_commerce.View.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.e_commerce.Core.Datastate
import com.example.e_commerce.data.models.UserLogin
import com.example.e_commerce.data.repository.AuthRepository

class LoginViewmodel() : ViewModel() {

    private val _login_respons: MutableLiveData<Datastate<UserLogin>> = MutableLiveData()

    val login_respons: LiveData<Datastate<UserLogin>> = _login_respons

    fun createlogin(user: UserLogin) {

        _login_respons.postValue(Datastate.Loading())

        val repoauth = AuthRepository()

        repoauth.userlogin(user).addOnSuccessListener {

            _login_respons.postValue(Datastate.Success(user))

        }.addOnFailureListener { error ->

            _login_respons.postValue(Datastate.Error(error.toString()))

        }


    }


}