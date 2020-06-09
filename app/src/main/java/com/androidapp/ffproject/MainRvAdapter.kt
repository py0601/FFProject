package com.androidapp.ffproject

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MainRvAdapter(val context: Context, val foodList : ArrayList<Food>, val itemClick : (Food) -> Unit) : RecyclerView.Adapter<MainRvAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_rv_item, parent, false)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder?.bind(foodList[position], context)
    }

    inner class Holder(itemView: View, itemClick: (Food) -> Unit) : RecyclerView.ViewHolder(itemView) {
        val foodPhoto = itemView.findViewById<ImageView>(R.id.FoodPhotoImg)
        val foodName = itemView.findViewById<TextView>(R.id.FoodNameTxt)
        val foodAdderss = itemView.findViewById<TextView>(R.id.FoodAddressTxt)
        val foodPhone = itemView.findViewById<TextView>(R.id.FoodPhoneTxt)

        fun bind (food: Food, context: Context) {
            if (food.FoodPhoto != ""){
                val resourceId = context.resources.getIdentifier(food.FoodPhoto, "drawable", context.packageName)
                foodPhoto?.setImageResource(resourceId)
            } else {
                foodPhoto?.setImageResource(R.mipmap.ic_launcher)
            }
            foodName?.text = food.FoodName
            foodAdderss?.text = food.FoodAddress
            foodPhone?.text = food.FoodPhone

            itemView.setOnClickListener{ itemClick(food)}
        }
    }
}