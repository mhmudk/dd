package com.example.dwayer.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.Login.Login
import com.example.dwayer.R
import com.example.dwayer.showToast

class NewPassword : AppCompatActivity() {
    lateinit var save: Button
    lateinit var back_image: ImageView
    lateinit var login: TextView
    lateinit var back_text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)
        contextId()
        save.setOnClickListener {
            showToast(applicationContext, "Password Updated")
            startActivity(Intent(this, Home::class.java))
        }
        back_image.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))

        }
        back_text.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))

        }
        login.setOnClickListener {
            startActivity(Intent(this, Login::class.java))

        }
    }

    private fun contextId() {
        save = findViewById(R.id.save_newpassword)
        back_image = findViewById(R.id.back_newpassword_image)
        back_text = findViewById(R.id.back_newpassword)
        login = findViewById(R.id.gotologin_newpassword)
    }
}