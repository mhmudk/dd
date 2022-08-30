package com.example.dwayer.Login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val repo = LoginRepo()
    private val _mutable   = MutableLiveData<Boolean>()
    var mutable : LiveData<Boolean> = _mutable
    fun  logInFirebase(email:String , password : String ){
        _mutable.postValue(repo.logIn(email,password))
    }



}