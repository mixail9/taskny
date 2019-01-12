package com.example.kon.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.util.*

class LangAdapter(val dataSet: ArrayList<LangItem>, val context: Context, val onItemClick: (pos: Int) -> Unit): RecyclerView.Adapter<LangViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangViewHolder {
        return LangViewHolder(LayoutInflater.from(context).inflate(R.layout.list_holder, parent, false))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: LangViewHolder, position: Int) {
        val data: LangItem = dataSet.get(position)

        with(data) {
            holder.viewItem.findViewById<TextView>(R.id.name).text = name
            holder.viewItem.findViewById<TextView>(R.id.author).text = author
            holder.viewItem.findViewById<TextView>(R.id.year).text = year.toString()
            holder.viewItem.findViewById<TextView>(R.id.paradigm).text = paradigm
            holder.viewItem.findViewById<ImageView>(R.id.logo).setImageBitmap(logo);
        }

        holder.viewItem.setOnClickListener { onItemClick(position) }
    }
}