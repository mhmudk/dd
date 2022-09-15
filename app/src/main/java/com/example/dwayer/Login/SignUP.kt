package com.example.dwayer.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dwayer.R

class SignUP : AppCompatActivity() {
    lateinit var button_next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        button_next = findViewById(R.id.button_signUp)
        button_next.setOnClickListener {
            startActivity(Intent(this, GetStarted::class.java))
        }
    }
}