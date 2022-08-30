package com.example.dwayer.Login

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.R
import com.example.dwayer.Register.Register
import com.example.dwayer.databinding.ActivityLoginBinding
import com.example.dwayer.ui.ForgetPassword
import com.example.dwayer.ui.Home

class Login : AppCompatActivity() {
    lateinit var button: Button
    lateinit var forgetPassword: TextView
    lateinit var signUp_login: TextView
    var pressed = false
    private lateinit var binding: ActivityLoginBinding
    //   private val loginviewmodel by lazy { LoginViewModel() }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        connect()
        transactions()

        /*
        binding.gotoLogin.setOnClickListener {

            binding.apply {
                val email = emailFire.text.toString()
                val passsword = passwordfire.text.toString()
                loginviewmodel.logInFirebase(email, passsword)
                getToken()
            }
        }
*/
    }

    /*
        private fun getToken() {
            loginviewmodel.mutable.observe(this) {
                if (it == true) {
                    startActivity(Intent(this, Home::class.java))
                } else {
                    showToast(baseContext, "Login failed")
                }
            }
        }
    */
    private fun connect() {

        button = findViewById(R.id.welcome)
        forgetPassword = findViewById(R.id.goto_forgetpassword)
        signUp_login = findViewById(R.id.goto_signup_login)
    }

    private fun transactions() {
        forgetPassword.setOnClickListener {
            startActivity(Intent(this, ForgetPassword::class.java))

        }
        button.setOnClickListener {

            startActivity(Intent(this, Home::class.java))
        }
        signUp_login.setOnClickListener {

            startActivity(Intent(this, Register::class.java))
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

