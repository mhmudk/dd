package com.example.dwayer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler


class SplachScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splach_screen)

        Handler().postDelayed({

    //            startActivity(Intent(this, ViewFlipper::class.java))



        }, 2000)
    }
}