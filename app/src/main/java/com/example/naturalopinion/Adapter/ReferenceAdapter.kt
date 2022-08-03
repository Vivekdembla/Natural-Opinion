package com.example.naturalopinion.Adapter

import android.graphics.Color
import android.text.Spannable
import android.text.SpannableString
import android.text.style.ForegroundColorSpan
import android.text.style.UnderlineSpan
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.naturalopinion.R


class ReferenceAdapter(heading : List<String>): RecyclerView.Adapter<ReferenceAdapter.ViewHolder>() {
    val items = heading

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val text = itemView.findViewById<TextView>(R.id.reference_text)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.reference_item,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val s = items[position]
        val ss = SpannableString(s)
//        makeBold(ss,s,"Books:")
//        makeBold(ss,s,"Journals and Periodicals:")
        underLine(ss,s,"Diet and Nutrition References")
        underLine(ss,s,"Botanical References")
        underLine(ss,s,"Homeopathy References")
        underLine(ss,s,"Other Treatment References")

        holder.text.text = ss

    }

    override fun getItemCount(): Int {
        return items.size
    }
    fun makeBold(ss : SpannableString,string:String,substr:String){
        if(string.indexOf(substr)!=-1 )
            ss.setSpan(android.text.style.StyleSpan(android.graphics.Typeface.BOLD),string.indexOf(substr),string.indexOf(substr)+substr.length,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
    }
    fun underLine(ss:SpannableString,text:String,substr:String){
        val index = text.indexOf(substr)
        if(index!=-1)
        ss.setSpan(UnderlineSpan(),index, index+substr.length,0)
    }
//    fun setGreenColor(ss:SpannableString,text: String,substr: String){
//        val index = text.indexOf(substr)
//        if(index!=-1)
//        ss.setSpan(ForegroundColorSpan(Color.GREEN), index, index+substr.length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//    }

}