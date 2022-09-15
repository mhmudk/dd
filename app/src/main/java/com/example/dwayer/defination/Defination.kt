package com.example.dwayer.defination

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.dwayer.R
import com.shuhart.stepview.StepView


class Defination : AppCompatActivity() {
    private lateinit var navController: NavController
    lateinit var stepv: StepView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_defination)
        val navHostController = supportFragmentManager
        .findFragmentById(R.id.fragmnets_transations) as NavHostFragment
        navController = navHostController.navController
        stepv = findViewById(R.id.dsd)
        stepv.state.animationType(StepView.ANIMATION_ALL)
            .stepsNumber(6)
            .animationDuration(resources.getInteger(android.R.integer.config_shortAnimTime))

            .commit()
    }

}
/*
    lateinit var stepv: StepView
    lateinit var pagger: ViewPager
    lateinit var btn_next: Button
/*
    var layout = intArrayOf(
        com.example.dwayer.R.layout.fragment_step_one,
        com.example.dwayer.R.layout.fragment_step_two,
        com.example.dwayer.R.layout.fragment_step_three,
        com.example.dwayer.R.layout.fragment_step_four,
        com.example.dwayer.R.layout.fragment_step_five,
        com.example.dwayer.R.layout.fragment_step_six
    )
*/


        stepv = findViewById(com.example.dwayer.R.id.dsd)
        pagger = findViewById(com.example.dwayer.R.id.viewpaaager)
        btn_next = findViewById(com.example.dwayer.R.id.button_next_pagger)
        stepv.state.animationType(StepView.ANIMATION_ALL)
            .stepsNumber(6)
            .animationDuration(resources.getInteger(android.R.integer.config_shortAnimTime))

            .commit()
        pagger.addOnPageChangeListener(object : OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

                stepv.go(position, true)
            }

            override fun onPageSelected(position: Int) {

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
        pagger.adapter = object : PagerAdapter() {
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

 */