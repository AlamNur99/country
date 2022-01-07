package com.alam.country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCountry: RecyclerView
    private var list: ArrayList<Country> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCountry = findViewById(R.id.rv_country)
        rvCountry.setHasFixedSize(true)

        list.addAll(CoutryData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvCountry.layoutManager = LinearLayoutManager(this)
        val listCounntryAdapter = ListCountryAdapter(list)
        rvCountry.adapter = listCounntryAdapter
    }
}