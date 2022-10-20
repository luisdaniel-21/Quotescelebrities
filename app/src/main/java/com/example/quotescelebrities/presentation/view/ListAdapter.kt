package com.example.quotescelebrities.presentation.view


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.quotescelebrities.R
import com.example.quotescelebrities.data.local.entities.QuoteEntity

class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {


    var items = ArrayList<QuoteEntity>()

    fun setListData(data: ArrayList<QuoteEntity>){
        this.items= data
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {


        fun bind(data: QuoteEntity){

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MyViewHolder {
        val inflater = LayoutInflater.from(parent.context).inflate(R.layout.recyclerview_item, parent, false)
        return MyViewHolder(inflater)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ListAdapter.MyViewHolder, position: Int) {
        holder.bind(items[position])

    }


}