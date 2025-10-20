package com.example.e_commerce

import android.widget.EditText

fun EditText.isempty(): Boolean{

   return if (this.text.isEmpty()){

        this.error = "Enter the value"

        true
    }else {

       false

   }

}