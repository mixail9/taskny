package com.example.kon.myapplication

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso
import java.util.*
import kotlin.collections.ArrayList

class LangAdapter(var dataSet: ArrayList<LangItem>, val context: Context, val onItemClick: (pos: Int) -> Unit): RecyclerView.Adapter<LangViewHolder>(), Filterable  {

    private var filtredDataSet: ArrayList<LangItem> = dataSet;

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LangViewHolder {
        return LangViewHolder(LayoutInflater.from(context).inflate(R.layout.list_holder, parent, false))
    }

    override fun getItemCount(): Int {
        return filtredDataSet.size
    }

    override fun onBindViewHolder(holder: LangViewHolder, position: Int) {
        val data: LangItem = filtredDataSet.get(position)

        with(data) {
            holder.viewItem.findViewById<TextView>(R.id.name).text = name
            holder.viewItem.findViewById<TextView>(R.id.author).text = author
            holder.viewItem.findViewById<TextView>(R.id.year).text = year.toString()
            holder.viewItem.findViewById<TextView>(R.id.paradigm).text = paradigm
            holder.viewItem.findViewById<ImageView>(R.id.logo).setImageBitmap(logo);
        }

        holder.viewItem.setOnClickListener { onItemClick(position) }
    }

    override fun getFilter(): Filter {
        return object: Filter() {
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                notifyDataSetChanged()
            }

            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val result = FilterResults()
                result.values = dataSet.filter{ it.paradigm.indexOf(constraint.toString()) >= 0}
                filtredDataSet = ArrayList(dataSet.filter{ it.paradigm.indexOf(constraint.toString()) >= 0})
                return result
            }
        }


    }
}