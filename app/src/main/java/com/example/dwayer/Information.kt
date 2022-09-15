package com.example.dwayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.dwayer.Login.Login
import com.example.dwayer.defination.Defination

class Information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)


        Handler().postDelayed({
            startActivity(Intent(this, Defination::class.java))
        }, 2000)
    }
}