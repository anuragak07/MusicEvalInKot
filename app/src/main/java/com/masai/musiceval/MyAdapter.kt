package com.masai.musiceval

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.masai.musiceval.models.ResultsDTO

class MyAdapter(private val list: List<ResultsDTO>): RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
         val resultsDTO =list[position]

        holder.setData(resultsDTO)

    }

    override fun getItemCount(): Int {
        return  list.size
    }
}