package com.example.e_commerce.View.sign

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.e_commerce.Core.Datastate
import com.example.e_commerce.data.models.UserRegister
import com.example.e_commerce.data.repository.AuthRepository

class Registerviewmodel(): ViewModel() {

    private val _mlivedata = MutableLiveData<Datastate<UserRegister>>()

    val mlivedata: LiveData<Datastate<UserRegister>> = _mlivedata

    fun registervm(user: UserRegister) {

        _mlivedata.postValue(Datastate.Loading())

        val authservice = AuthRepository()

        authservice.userregister(user).addOnSuccessListener {

           _mlivedata.postValue(Datastate.Success(user))

        }.addOnFailureListener {error->

            _mlivedata.postValue(Datastate.Error(error.message))

        }


    }

}