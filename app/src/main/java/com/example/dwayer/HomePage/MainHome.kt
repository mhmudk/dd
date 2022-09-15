package com.example.dwayer.HomePage

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.dwayer.ChooseAssociation
import com.example.dwayer.R

class MainHome : Fragment() {

    lateinit var button_choose: Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
    val view  = inflater.inflate(R.layout.fragment_main_home, container, false)
        button_choose=view.findViewById(R.id.home_to_choose)
        button_choose.setOnClickListener {
            startActivity(Intent(requireContext(), ChooseAssociation::class.java))
        }
        return view
    }


}