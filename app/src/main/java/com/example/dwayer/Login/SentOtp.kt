package com.example.dwayer.Login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dwayer.R

class SentOtp : AppCompatActivity() {
    lateinit var button_next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sent_otp2)
        button_next = findViewById(R.id.button_otp)
        button_next.setOnClickListener {
            startActivity(Intent(this, SignUP::class.java))
        }
    }
}