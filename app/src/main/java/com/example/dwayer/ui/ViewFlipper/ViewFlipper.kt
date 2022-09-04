package com.example.dwayer.ui.ViewFlipper

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.dwayer.R
import com.example.dwayer.ui.Home


class ViewFlipper : AppCompatActivity() {

    var pagger: ViewPager? = null
    lateinit var skip: TextView
    var layout = intArrayOf(
        R.layout.appropiate_category,
        R.layout.upload_decument_category,
        R.layout.contract_category,
        R.layout.payment_category,
        R.layout.arrest_category
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_flipper)
        pagger = findViewById(R.id.pager)
        skip = findViewById(R.id.skip_to_home)

        pagger?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })
        pagger?.adapter = object : PagerAdapter() {
            override fun instantiateItem(container: ViewGroup, position: Int): Any {
                val layoutInflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
                val v: View = layoutInflater.inflate(layout[position], container, false)
                container.addView(v)
                return v
            }

            override fun getCount(): Int {
                return layout.size
            }

            override fun isViewFromObject(view: View, `object`: Any): Boolean {
                return view === `object`
            }

            override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
                val v: View = `object` as View
                container.removeView(v)
            }
        }
        skip.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }

    }
}