package com.example.naturalopinion.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.R

class MedicalAdapter(private val listener : onMedicalItemClick,
                     val premium : Boolean, val context : Context,
                     val items : ArrayList<String>,val number : Int = 4,
                     val details: ArrayList<String> = ArrayList<String>()) : RecyclerView.Adapter<MedicalAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val heading = itemView.findViewById<TextView>(R.id.heading)
        val detail = itemView.findViewById<TextView>(R.id.detail)
        val right_arrow = itemView.findViewById<AppCompatImageView>(R.id.right_arrow)
        val line = itemView.findViewById<View>(R.id.line)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView : View = LayoutInflater.from(parent.context).inflate(R.layout.medical_items,parent,false)
        val viewHolder = ViewHolder(itemView)
            itemView.setOnClickListener {
                listener.onItemCLick(viewHolder.adapterPosition)
            }
        return viewHolder
    }

    @SuppressLint("RestrictedApi")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.heading.text = items[position]
        if(position<details.size)
        holder.detail.text = details[position]
        else
            holder.detail.text = ""
        if(premium || position == number){
            holder.heading.setTextColor(ContextCompat.getColor(context, R.color.black))
            holder.detail.setTextColor(ContextCompat.getColor(context, R.color.black))
            holder.right_arrow.supportBackgroundTintList = ContextCompat.getColorStateList(context, R.color.black)
            holder.line.setBackgroundColor(ContextCompat.getColor(context, R.color.black))
        }else{
            holder.heading.setTextColor(ContextCompat.getColor(context, R.color.light_green))
            holder.detail.setTextColor(ContextCompat.getColor(context, R.color.light_green))
            holder.right_arrow.supportBackgroundTintList = ContextCompat.getColorStateList(context, R.color.light_green)
            holder.line.setBackgroundColor(ContextCompat.getColor(context, R.color.light_green))
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

interface onMedicalItemClick {
    fun onItemCLick(position : Int)
}
