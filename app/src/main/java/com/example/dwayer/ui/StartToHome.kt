package com.example.dwayer.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dwayer.R
import com.example.dwayer.Register.Register
import com.example.dwayer.databinding.ActivityStartToHomeBinding

class StartToHome : AppCompatActivity() {
lateinit var button :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_start_to_home)
        button = findViewById(R.id.getstarted_button)

        button.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
        }
    }
}