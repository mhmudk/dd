package com.example.dwayer.defination

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dwayer.Pojo.SpinnerIt
import com.example.dwayer.R
import com.example.dwayer.SpinnerAdapter


class StepOne : Fragment(), AdapterView.OnItemSelectedListener {

    lateinit var button_next: Button
    lateinit var spinnerone: Spinner
    lateinit var spinnertwo: Spinner
    lateinit var spinnerthree: Spinner
    lateinit var spinnerfour: Spinner
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_step_one, container, false)
        connectview(view)
        button_next.setOnClickListener {
            findNavController().navigate(R.id.action_nav_home_to_setptwo)
        }
        spinnerRecidence()
        spinnerDuration()
        spinnerCity()
        spinnerDistrict()
        return view
    }

    private fun connectview(view: View) {
        button_next = view.findViewById(R.id.button_stepone)
        spinnerone = view.findViewById(R.id.spinnerOne)
        spinnertwo = view.findViewById(R.id.spinner2)
        spinnerthree = view.findViewById(R.id.spinner3)
        spinnerfour = view.findViewById(R.id.spinner4)


    }

    private fun spinnerRecidence() {
        val categories: MutableList<SpinnerIt> = ArrayList()
        categories.add(SpinnerIt("Residence Type"))
        categories.add(SpinnerIt("Short"))
        categories.add(SpinnerIt("Long"))
        val dataAdapter =
            SpinnerAdapter(requireContext(), R.layout.spinner_iteem3, categories)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerone.setAdapter(dataAdapter)
    }

    private fun spinnerDuration() {
        val categories: MutableList<SpinnerIt> = ArrayList()
        categories.add(SpinnerIt("Duration in current residence"))
        categories.add(SpinnerIt("10 Days"))
        categories.add(SpinnerIt("20 Days"))
        val dataAdapter =
            SpinnerAdapter(requireContext(), R.layout.spinner_iteem3, categories)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnertwo.setAdapter(dataAdapter)
    }

    private fun spinnerCity() {
        val categories: MutableList<SpinnerIt> = ArrayList()
        categories.add(SpinnerIt("City"))
        categories.add(SpinnerIt("Cairo"))
        categories.add(SpinnerIt("Giza"))
        val dataAdapter =
            SpinnerAdapter(requireContext(), R.layout.spinner_iteem3, categories)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerthree.setAdapter(dataAdapter)
    }

    private fun spinnerDistrict() {
        val categories: MutableList<SpinnerIt> = ArrayList()
        categories.add(SpinnerIt("District"))
        categories.add(SpinnerIt("eeeee"))
        categories.add(SpinnerIt("laaaaa"))
        val dataAdapter =
            SpinnerAdapter(requireContext(), R.layout.spinner_iteem3, categories)
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerfour.setAdapter(dataAdapter)
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {


    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

}