package com.example.e_commerce.base

import android.app.ProgressDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB: ViewBinding>(private val inflatelayout:(inflate: LayoutInflater)->VB): Fragment() {

    private var _binding:VB? = null

    val binding:VB get() = _binding as  VB

    lateinit var loading : ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = inflatelayout.invoke(inflater)

        loading = ProgressDialog(requireContext())

        createuser()

        observer()

        return binding.root
    }


    abstract fun createuser()

    abstract fun observer()


}