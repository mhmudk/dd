package com.example.dwayer.defination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.dwayer.R

class StepFour : Fragment() {
lateinit var step_next:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  =  inflater.inflate(R.layout.fragment_step_four, container, false)
        step_next  = view.findViewById(R.id.stepfour_next)
        step_next.setOnClickListener {
            findNavController().navigate(R.id.action_stephour_to_stepfive)
        }

        return view
    }


}