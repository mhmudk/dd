package com.example.dwayer.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dwayer.HomePage.Home
import com.example.dwayer.R

class GetStarted : AppCompatActivity() {
lateinit var button_getstarted:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)
button_getstarted = findViewById(R.id.button_started)
        button_getstarted.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

    }
}