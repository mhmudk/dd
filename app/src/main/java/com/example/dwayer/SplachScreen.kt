package com.example.dwayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dwayer.Login.Login
import com.example.dwayer.ui.Home
import com.google.firebase.auth.FirebaseAuth

class SplachScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screen)

        val user = FirebaseAuth.getInstance().currentUser

        if(user==null){

            startActivity(Intent(applicationContext, Login::class.java))
        }else{
            startActivity(Intent(applicationContext,Home::class.java))

        }
    }
}