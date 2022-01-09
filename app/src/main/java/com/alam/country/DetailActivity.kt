package com.alam.country

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra name"
        const val EXTRA_CAPITAL = "extra capital"
        const val EXTRA_DETAIL = "extra detail"
        const val EXTRA_LEAD = "extra lead"
        const val EXTRA_LANGUAGE = "extra language"
        const val EXTRA_AREA = "extra area"
        const val EXTRA_MONEY = "extra money"
        const val EXTRA_PHOTO = "extra photo"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setActionBarTitle()

        val nameReceived: TextView = findViewById(R.id.county_name)
        nameReceived.text = intent.getStringExtra(EXTRA_NAME)

        val capitalReceived: TextView = findViewById(R.id.capital_contry)
        capitalReceived.text = intent.getStringExtra(EXTRA_CAPITAL)

        val detailReceived: TextView = findViewById(R.id.country_detail)
        detailReceived.text = intent.getStringExtra(EXTRA_DETAIL)

        val leadReceived: TextView = findViewById(R.id.lead_contry)
        leadReceived.text = intent.getStringExtra(EXTRA_LEAD)

        val languageReceived: TextView = findViewById(R.id.lang_contry)
        languageReceived.text = intent.getStringExtra(EXTRA_LANGUAGE)

        val areaReceived: TextView = findViewById(R.id.area_contry)
        areaReceived.text = intent.getStringExtra(EXTRA_AREA)

        val moneyReceived: TextView = findViewById(R.id.money_contry)
        moneyReceived.text = intent.getStringExtra(EXTRA_MONEY)

        val imageReceived: ImageView = findViewById(R.id.image_country)
        imageReceived.setImageResource(intent.getIntExtra(EXTRA_PHOTO, 0))

        val tentang: TextView = findViewById(R.id.tentang)
        tentang.text = "Tentang " + intent.getStringExtra(EXTRA_NAME)

    }

    private fun setActionBarTitle() {
        supportActionBar?.title = "Detail " + intent.getStringExtra(EXTRA_NAME)
    }
}