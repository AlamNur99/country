package com.alam.country

import android.view.LayoutInflater
import android.view.ScrollCaptureCallback
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCountryAdapter(private val listCountry: ArrayList<Country>): RecyclerView.Adapter<ListCountryAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCapital: TextView = itemView.findViewById(R.id.tv_item_capital)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_country, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val country = listCountry[position]
        Glide.with(holder.itemView.context)
            .load(country.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.tvName.text = country.name
        holder.tvCapital.text = country.capital

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listCountry[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listCountry.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Country)
    }

}