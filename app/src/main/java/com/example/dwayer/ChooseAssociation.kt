package com.example.dwayer

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat

class ChooseAssociation : AppCompatActivity() {
    lateinit var nextbtn: Button
    lateinit var umbnerchoosed: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_association)
        nextbtn=findViewById(R.id.next_choose_n)
        umbnerchoosed=findViewById(R.id.button_choose_number)
        nextbtn.setOnClickListener {
            nextbtn.setBackgroundColor(resources.getColor(R.color.btn_cliked_next))
            nextbtn.setTextColor(Color.parseColor("#FFFFFFFF"))
            startActivity(Intent(this,Information::class.java))
        }
        umbnerchoosed.setOnClickListener {
            umbnerchoosed.setTextColor(ContextCompat.getColor(applicationContext, R.color.white));
            umbnerchoosed.setBackgroundColor(resources.getColor(R.color.maincolor))

        }
    }
}