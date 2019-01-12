package com.example.kon.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.MotionEvent
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = LangCollection(this).getList()
        val viewManager = GridLayoutManager(this, 1)
        val viewAdapter = LangAdapter(data, baseContext, fun(pos){
            val intent = Intent(this, Main2Activity::class.java).apply{
                putExtra("site", data.get(pos).site)
            }

            startActivity(intent)
        })


        findViewById<RecyclerView>(R.id.langList).apply {
            setHasFixedSize(false)
            layoutManager = viewManager
            adapter = viewAdapter
        }


        buttonFilter.setOnClickListener{
            //viewAdapter.dataSet = ArrayList(LangCollection(this).getList().filter { it.paradigm.indexOf(textFilter.text.toString()) >= 0 })
            viewAdapter.getFilter().filter(textFilter.text.toString())
            Log.d("qq", "click " + textFilter.text.toString())
        }

    }


}
