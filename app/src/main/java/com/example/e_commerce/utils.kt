package com.example.e_commerce

import android.content.SharedPreferences.Editor
import android.widget.EditText

fun EditText.isEmpty():Boolean{

  return if (this.text.toString().isEmpty()){

       this.error = "Please Enter the value"

       true

    }else{

     false

    }


}