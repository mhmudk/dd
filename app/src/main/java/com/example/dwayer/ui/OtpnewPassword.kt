package com.example.dwayer.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.R
import com.example.dwayer.showToast

class OtpnewPassword : AppCompatActivity() {
    lateinit var contunio: Button
    lateinit var resend_message: TextView
    lateinit var back: TextView
    lateinit var back_image: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpnew_password)
        contunio = findViewById(R.id.contunioto_home)
        resend_message = findViewById(R.id.resend_password)
        back = findViewById(R.id.backto_forgetpassword)
        back_image = findViewById(R.id.backto_forgetpassword_otp)

        contunio.setOnClickListener {
            startActivity(Intent(this, NewPassword::class.java))
        }
        resend_message.setOnClickListener {
            showToast(applicationContext, "Message sent again")
        }
        back.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))
        }
        back_image.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))
        }
    }
}