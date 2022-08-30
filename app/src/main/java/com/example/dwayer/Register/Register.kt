package com.example.dwayer.Register

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.Login.Login
import com.example.dwayer.R
import com.example.dwayer.ui.Home

class Register : AppCompatActivity() {
    lateinit var save: Button
    lateinit var back: TextView
    var pressed = false
  //    private val registerViewModel by lazy {RegisterViewModel()}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        save = findViewById(R.id.welcoxme)
        back = findViewById(R.id.backto_login_register)

        save.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }
        back.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
        /*
        binding.signupFire.setOnClickListener {
            binding.apply {
                var name = nameInput.text.toString()
                var email = emailInput.text.toString()
                var phone = phoneInput.text.toString()
                var password = passwordInput.text.toString()
                val currentUserId = FirebaseAuth.getInstance().currentUser?.uid.toString()
                val user = User(id = currentUserId, name, email, phone, password," retype")
                registerViewModel.Registeration(user)
                getToken()

            }

        }
*/
    }
    /*
  private  fun getToken() {
        registerViewModel.mutable.observe(this) {
            if (it == true) {
                startActivity(Intent(this, Login::class.java))
            } else {
                showToast(applicationContext, "Registeration failed")

            }
        }
    }

     */
    override fun onBackPressed() {
        if (pressed) {
            super.onBackPressed()
        } else {

            return
        }
    }
}