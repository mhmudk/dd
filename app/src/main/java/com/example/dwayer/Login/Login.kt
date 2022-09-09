package com.example.dwayer.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.R
import com.example.dwayer.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    lateinit var button_next: Button

    var pressed = false
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        button_next = findViewById(R.id.button_next_login)
        button_next.setOnClickListener {
            startActivity(Intent(this, SentOtp::class.java))
        }
    }

    override fun onBackPressed() {
        if (pressed) {
            super.onBackPressed()
        } else {

            return
        }
    }
}

