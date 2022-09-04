package com.example.dwayer.Register

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dwayer.Pojo.User

class RegisterViewModel: ViewModel() {
    val repo = RegisterRepo()
    private val _mutable = MutableLiveData<Boolean>()
    val mutable: LiveData<Boolean> = _mutable

    fun Registeration(user: User) {
      //  _mutable.postValue(repo.createUserWithEmailAndPassword(user))
    }

}