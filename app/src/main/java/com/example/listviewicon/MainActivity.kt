package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.Adapter.ListIconAdapter
import com.example.listviewicon.modul.Icon
import com.example.listviewicon.modul.Icon_Data

class MainActivity : AppCompatActivity() {
    private lateinit var rvIcon: RecyclerView
    private var list: ArrayList<Icon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvIcon = findViewById(R.id.rv_Icon)
        rvIcon.setHasFixedSize(true)
        list.addAll(Icon_Data.listicon)
        showIconList()
    }
    private fun showIconList() {
        rvIcon.layoutManager = LinearLayoutManager(this)
        val listIconAdapter = ListIconAdapter(list)
        rvIcon.adapter = listIconAdapter
    }
}
