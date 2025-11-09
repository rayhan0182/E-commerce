package com.example.e_commerce.Core

sealed class Datastate<T>(

    val massage: String? = null,

    val data:T? = null



) {


    class Loading<T>(): Datastate<T>()

    class Error<T>(massage: String?): Datastate<T>(massage)

    class Success<T>(jdata:T?): Datastate<T>(data = jdata)

}