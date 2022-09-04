package com.example.dwayer

import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.dwayer.Adapters.OnBoardingAdapter
import com.example.dwayer.Pojo.OnboardingItems

class MainActivity : AppCompatActivity() {
    var list_onboardingItems: MutableList<OnboardingItems> = mutableListOf()
    val onboardingAdatper: OnBoardingAdapter by lazy { OnBoardingAdapter() }
    lateinit var layoutOnbaordingIndicator: LinearLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpOnBaordingItems()
        var onBoardingViewpager: ViewPager2 = findViewById(R.id.viewpagere)
        layoutOnbaordingIndicator =
            findViewById(R.id.linear_onBoarding_indicators)
        onBoardingViewpager.adapter = onboardingAdatper
       // setUpOnBoardingIndicators()
     //   setCurrentonBoardIndicators(0)
    }

    private fun setUpOnBaordingItems() {


        val data: OnboardingItems = OnboardingItems()
        data.title = "Pay your Bill online Data1"
        data.discriptions = "Electric bill payment is a future of online Data1 "
        data.image = R.drawable.cash_payment


        val data2: OnboardingItems = OnboardingItems()
        data.title = "Pay your Bill online  Data2"
        data.discriptions = "Electric bill payment is a future of online Data2 "
        data.image = R.drawable.arrest


        val data3: OnboardingItems = OnboardingItems()
        data.title = "Pay your Bill online Data3"
        data.discriptions = "Electric bill payment is a future of online Data3  "
        data.image = R.drawable.contract
        list_onboardingItems.add(data)
        list_onboardingItems.add(data2)
        list_onboardingItems.add(data3)
        onboardingAdatper.add(list_img = list_onboardingItems)
    }
/*
    private fun setUpOnBoardingIndicators() {


        val indicators = arrayOfNulls<ImageView?>(onboardingAdatper.itemCount)
        var layoutparams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT
        )
        layoutparams.setMargins(8, 0, 8, 0)
        for (i in indicators) {
            indicators[i] = ImageView(applicationContext)
            indicators[i]!!.setImageDrawable(
                ContextCompat.getDrawable(
                    applicationContext, R.drawable.onboarding_indicator_inactive
                )
            )
            indicators[i]!!.layoutParams = layoutparams
            layoutOnbaordingIndicator.addView(indicators[i])
        }

    }
    /*
    fun setCurrentonBoardIndicators(index:Int){
        var childCount:Int = layoutOnbaordingIndicator.childCount
        for (1.. 54){
           var  imgview:ImageView = layoutOnbaordingIndicator.getChildAt(i) as ImageView
            if(i == index){
                imgview.setImageDrawable(ContextCompat.getDrawable(applicationContext,R.drawable.onboarding_indicator))

            }else{
                imgview.setImageDrawable(ContextCompat.getDrawable(applicationContext,R.drawable.onboarding_indicator_inactive))

            }
        }
    }
    */

 */
}