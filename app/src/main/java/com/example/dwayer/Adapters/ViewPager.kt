package com.example.dwayer.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager.widget.PagerAdapter
import com.example.dwayer.R

class ViewPager(val contfext: Context): PagerAdapter() {
    lateinit  var context: Context
    lateinit var layout:LayoutInflater

    var array = intArrayOf(
        R.layout.arrest_category,
        R.layout.contract_category,
        R.layout.appropiate_category,
        R.layout.upload_decument_category,
        R.layout.payment_category
    )

    override fun getCount(): Int {
       return array.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        TODO("Not yet implemented")
    }
}