package com.example.listviewicon.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listviewicon.R
import com.example.listviewicon.modul.Icon

class ListIconAdapter (private val listIcon: ArrayList<Icon>) : RecyclerView.Adapter<ListIconAdapter.IconViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IconViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_icon, parent, false)
        return IconViewHolder(view)
    }
    override fun getItemCount(): Int {
        return listIcon.size
    }
    override fun onBindViewHolder(holder: IconViewHolder, position: Int) {
        val icon = listIcon[position]
        holder.tvName.text = icon.name
        holder.tvDetail.text = icon.detail
        Glide.with(holder.itemView.context)
            .load(icon.poster)
            .into(holder.imgPoster)
    }
    inner class IconViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPoster: ImageView = itemView.findViewById(R.id.img_item_poster)
    }

}