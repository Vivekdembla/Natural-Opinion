package com.example.naturalopinion.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.R
import org.w3c.dom.Text

class DatabaseAdapter(val listener : onDatabaseClick): RecyclerView.Adapter<DatabaseAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val card = itemView.findViewById<CardView>(R.id.data_item_card)
        val image = itemView.findViewById<ImageView>(R.id.photo)
        val heading = itemView.findViewById<TextView>(R.id.heading)
        val description = itemView.findViewById<TextView>(R.id.description)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.database_item,parent,false)
        val viewHolder = ViewHolder(itemView)
        itemView.setOnClickListener {
            listener.onItemClick(viewHolder.adapterPosition)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(position){
            0 -> {
                holder.image.setImageResource(R.drawable.ic_medical_condition)
                holder.heading.text = "Medical Condition"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
            1 -> {
                holder.image.setImageResource(R.drawable.ic_vitamin_mineral)
                holder.heading.text = "Vitamins and Minerals"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
            2 -> {
                holder.image.setImageResource(R.drawable.ic_food_nutrition)
                holder.heading.text = "Food and Nutrition"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
            3 -> {
                holder.image.setImageResource(R.drawable.ic_botanical_icon)
                holder.heading.text = "Botanicals"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
            4 -> {
                holder.image.setImageResource(R.drawable.ic_supplement)
                holder.heading.text = "Suppliments"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
            5 -> {
                holder.image.setImageResource(R.drawable.ic_therapy)
                holder.heading.text = "Other Therapies"
                holder.description.text = "Lorem ipsum dolor sit amet\nLorem ipsum dolor"
            }
        }
    }

    override fun getItemCount(): Int {
        return 6
    }

    interface onDatabaseClick{
        fun onItemClick(position : Int)
    }

}