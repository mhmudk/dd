package com.example.dwayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.dwayer.Pojo.SpinnerIt

class SpinnerAdapter(context: Context, var resource: Int, var arraylist: MutableList<SpinnerIt>) :


    ArrayAdapter<SpinnerIt>(context, resource, arraylist) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        lateinit var text: TextView
        lateinit var img: ImageView
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.spinner_iteem3, parent, false)
        text = convertView.findViewById(R.id.textmeww)
        img = convertView.findViewById(R.id.imgdnew)

        text.text = arraylist[position].name
        img.setImageResource(R.drawable.ic_icon_spinner)

        return convertView
    }
}