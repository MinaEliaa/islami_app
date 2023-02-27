package com.example.islamicc_app.ui.home.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamicc_app.R


class SuraNameAdapter(var items:List<String>):RecyclerView.Adapter<SuraNameAdapter.ViewHolder> () {

    class ViewHolder (itemView:View):RecyclerView.ViewHolder(itemView){

        val name: TextView = itemView.findViewById(R.id.chapter_label)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_chapter_name,parent,false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

            val suraname =items.get(position)
            holder.name.setText(suraname)
        if (onItemClickListener == null) return
        holder.itemView.setOnClickListener{
            onItemClickListener?.onitemClick(position,suraname)
        }
    }

    override fun getItemCount(): Int {

        return items.size
    }

    var onItemClickListener : onItemSelectListener?=null //how many click on item

    interface onItemSelectListener { // call back when click on any item of recycle view
        fun onitemClick (position: Int , name :String)
    }


}