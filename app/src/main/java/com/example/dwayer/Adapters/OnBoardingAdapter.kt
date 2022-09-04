package com.example.dwayer.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dwayer.Pojo.OnboardingItems
import com.example.dwayer.R

class OnBoardingAdapter : RecyclerView.Adapter<OnBoardingAdapter.ViewHolder>() {
    var list_img: MutableList<OnboardingItems> = mutableListOf()
fun add(list_img: MutableList<OnboardingItems>){
    this.list_img=list_img
}
    override fun onCreateViewHolder(parent: ViewGroup,viewType: Int): OnBoardingAdapter.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.onboarding_list, parent, false)
        )
    }

    override fun onBindViewHolder(holder: OnBoardingAdapter.ViewHolder, position: Int) {
        var data: OnboardingItems = list_img[position]
        holder.connectViewbyData(data)
    }

    override fun getItemCount(): Int {
        return list_img.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.img_list)
        val text1: TextView = itemView.findViewById(R.id.text_welcome)
        val text2: TextView = itemView.findViewById(R.id.text_decs)

        fun connectViewbyData( data: OnboardingItems) {
            img.setImageResource(data.image!!)
            text1.text = data.title
            text2.text = data.discriptions
        }
    }
}