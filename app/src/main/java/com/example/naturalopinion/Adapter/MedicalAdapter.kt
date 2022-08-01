package com.example.naturalopinion.Adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.R
import java.util.*
import kotlin.collections.ArrayList


class MedicalAdapter(private val listener : onMedicalItemClick,
                     val premium : Boolean, val context : Context,
                     var items : ArrayList<String>, val number : Int = 0,
                     val details: ArrayList<String> = ArrayList<String>()) :
    RecyclerView.Adapter<MedicalAdapter.ViewHolder>(), Filterable  {
    var filter : ArrayList<String> = items
    var filter_detail : ArrayList<String> = details
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
                var index = 0
                for(i in 0 until items.size){
                    if(items[i] == filter[viewHolder.adapterPosition]){
                        index = i
                        break
                    }
                }
                listener.onItemCLick(index)
            }
        return viewHolder
    }

    @SuppressLint("RestrictedApi")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.heading.text = filter[position]
        if(position<filter_detail.size)
        holder.detail.text = filter_detail[position]
        else
            holder.detail.text = ""
        if(premium || filter[position] == items[number]){
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
        return filter.size
    }
    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults? {
                val charSeq = constraint.toString()
                if (charSeq.isEmpty()) {
                    filter = items
                    filter_detail = details
                } else {
                    val list1: ArrayList<String> = ArrayList()
                    val list2: ArrayList<String> = ArrayList()
                    for(i in 0..items.size){
                        val stateName = items[i]
                        if (stateName.lowercase(Locale.ROOT)
                                .contains(charSeq.lowercase(Locale.getDefault()))
                        ) {
                            list1.add(stateName)
                            list2.add(details[i])
                        }
                    }
                    filter = list1
                    filter_detail = list2
                }
                val filterResults = FilterResults()
                filterResults.values = filter
                return filterResults
            }

            @SuppressLint("NotifyDataSetChanged")
            override fun publishResults(constraint: CharSequence?, results: FilterResults) {

                filter = results.values as ArrayList<String>
                notifyDataSetChanged()
            }
        }
    }
    fun updateList(list: List<String>,list2 : ArrayList<String> = ArrayList<String>()) {
//        items = list as ArrayList<String>
        filter = list as ArrayList<String>
        filter_detail = list2
        notifyDataSetChanged()
    }
}

interface onMedicalItemClick {
    fun onItemCLick(position : Int)
}
