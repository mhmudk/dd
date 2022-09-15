package com.example.dwayer.defination

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import com.example.dwayer.Pojo.SpinnerIt
import com.example.dwayer.R
import com.example.dwayer.SpinnerAdapter

class StepTwo : Fragment() {
    lateinit var spinner: Spinner
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view  = inflater.inflate(R.layout.fragment_step_two, container, false)
        val button_next = view.findViewById<Button>(R.id.button_steptwo)
        spinner  = view.findViewById(R.id.pro_spinner)
        button_next.setOnClickListener {
            findNavController().navigate(R.id.action_setptwo_to_setpthree)
        }
        spinnerEducationLevel()

        return view
    }
    private fun spinnerEducationLevel(){
        val categories: MutableList<SpinnerIt> = ArrayList()
        categories.add(SpinnerIt("Profession"))
        categories.add(SpinnerIt("test1"))
        categories.add(SpinnerIt("test2"))
        categories.add(SpinnerIt("test3"))

        val dataAdapter =
            SpinnerAdapter(requireContext(), R.layout.spinner_iteem3,categories)

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.setAdapter(dataAdapter)
    }

}