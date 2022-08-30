package com.example.dwayer.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.Login.Login
import com.example.dwayer.R
import com.example.dwayer.showToast

class ForgetPassword : AppCompatActivity() {
    lateinit var back: TextView
    lateinit var toLogin: TextView
    lateinit var sendPassw: Button
    var pressed = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        back = findViewById(R.id.back_from_foget)
        sendPassw = findViewById(R.id.sendmessage_newpassword)
        toLogin = findViewById(R.id.goto_login_forgetPassword)

        back.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
        toLogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
        sendPassw.setOnClickListener {
            showToast(applicationContext, "Check Your messages")
            startActivity(Intent(this, Login::class.java))


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