package com.example.e_commerce.core

sealed class DataState<T>(

    val massage: String? = null,

    val data: T? = null


) {

    class Loading<T> : DataState<T>()

    class Success<T>(jdata: T?) : DataState<T>(data = jdata)

    class Error<T>(massage: String) : DataState<T>(massage)


}