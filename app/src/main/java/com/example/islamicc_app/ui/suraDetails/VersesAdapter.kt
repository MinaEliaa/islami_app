package com.example.islamicc_app.ui.suraDetails

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.islamicc_app.R

class VersesAdapter() : RecyclerView.Adapter<VersesAdapter.ViewHolder>() {

    var items: List<String>? = null



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_verse, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val content: String? = items?.get(position)
        holder.content.setText(content)
    }

    override fun getItemCount(): Int {
        return items?.size ?: 0
    }


    fun changeData(verses : List<String>) {
        this.items = verses
        notifyDataSetChanged()
    }
    class ViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

        val content: TextView = itemview.findViewById(R.id.content)
    }
}