package com.example.dwayer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dwayer.databinding.ActivityTransactionsBinding

class Transactions : AppCompatActivity() {
    private lateinit var binding: ActivityTransactionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionsBinding.inflate(layoutInflater)

    }
}