package com.example.dwayer.defination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dwayer.Pojo.SpinnerIt
import com.example.dwayer.R
import com.example.dwayer.SpinnerAdapter

class StepFive : Fragment()  {
    lateinit var step_next: Button
    lateinit var spinnerone: Spinner
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val  view   =  inflater.inflate(R.layout.fragment_step_five, container, false)

        step_next  = view.findViewById(R.id.stepfive_next)
        spinnerone  = view.findViewById(R.id.spinner_education)
        step_next.setOnClickListener {
            findNavController().navigate(R.id.action_stepfive_to_stepsix)
        }
        spinnerEducationLevel()
        return view
    }
private fun spinnerEducationLevel(){
    val categories: MutableList<SpinnerIt> = ArrayList()
    categories.add(SpinnerIt("Education Level"))
    categories.add(SpinnerIt("test1"))
    categories.add(SpinnerIt("test2"))
    categories.add(SpinnerIt("test3"))

    val dataAdapter =
        SpinnerAdapter(requireContext(), R.layout.spinner_iteem3,categories)

    dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    spinnerone.setAdapter(dataAdapter)
}


}
