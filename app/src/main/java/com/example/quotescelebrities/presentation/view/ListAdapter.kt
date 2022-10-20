package com.example.quotescelebrities.presentation.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quotescelebrities.R
import com.example.quotescelebrities.data.local.entities.QuoteEntity

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    var quoteLIst = emptyList<QuoteEntity>()

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false))
    }

    override fun getItemCount(): Int {
        return quoteLIst.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = quoteLIst[position]




    }

}