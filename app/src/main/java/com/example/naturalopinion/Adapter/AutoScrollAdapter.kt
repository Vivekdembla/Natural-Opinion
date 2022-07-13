package com.example.naturalopinion.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.R

class AutoScrollAdapter : RecyclerView.Adapter<AutoScrollAdapter.ViewHolder> {
    lateinit var view : View
    var context : Context

    constructor(context : Context){
        this.context = context
    }
    public class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.card_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        view = LayoutInflater.from(context).inflate(R.layout.card_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when(position){
            0 -> holder.image.setImageResource(R.drawable.ic_first_image)
            1 -> holder.image.setImageResource(R.drawable.ic_second_image)
            2 -> holder.image.setImageResource(R.drawable.ic_third_image)
        }

    }

    override fun getItemCount(): Int {
        return 3
    }

}