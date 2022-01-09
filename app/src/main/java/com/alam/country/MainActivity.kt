package com.alam.country

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
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

    private fun showSelectedCountry(country: Country) {
        val moveToDetail = Intent(this@MainActivity, DetailActivity::class.java)
        moveToDetail.putExtra(DetailActivity.EXTRA_NAME, country.name)
        moveToDetail.putExtra(DetailActivity.EXTRA_DETAIL, country.detail)
        moveToDetail.putExtra(DetailActivity.EXTRA_CAPITAL, country.capital)
        moveToDetail.putExtra(DetailActivity.EXTRA_LANGUAGE, country.language)
        moveToDetail.putExtra(DetailActivity.EXTRA_AREA, country.area)
        moveToDetail.putExtra(DetailActivity.EXTRA_LEAD, country.lead)
        moveToDetail.putExtra(DetailActivity.EXTRA_MONEY, country.money)
        moveToDetail.putExtra(DetailActivity.EXTRA_PHOTO, country.photo)
        startActivity(moveToDetail)
    }

    private fun showRecyclerList() {
        rvCountry.layoutManager = LinearLayoutManager(this)
        val listCounntryAdapter = ListCountryAdapter(list)
        rvCountry.adapter = listCounntryAdapter

        listCounntryAdapter.setOnItemClickCallback(object : ListCountryAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Country) {
                showSelectedCountry(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode()
        return super.onOptionsItemSelected(item)
    }

    private fun setMode() {
        val aboutPage = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(aboutPage)
    }
}