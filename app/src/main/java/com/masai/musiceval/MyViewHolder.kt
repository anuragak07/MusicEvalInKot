package com.masai.musiceval

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.masai.musiceval.models.ResultsDTO

class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

    val mIvImage: ImageView = itemView.findViewById(R.id.ivImage1)
    val mTackName: TextView = itemView.findViewById(R.id.tvTrackName)
    val mArtistName: TextView =itemView.findViewById(R.id.tvArtistName)
    val mBtnPlay: Button =itemView.findViewById(R.id.btnPlay)
    val mBtnPause:Button=itemView.findViewById(R.id.btnPause)
    val mBtnDel:Button =itemView.findViewById(R.id.btnDel)
    fun setData( resultsDTO: ResultsDTO){
        Glide.with(mIvImage).load(resultsDTO.artistViewUrl).into(mIvImage)
        mTackName.text = resultsDTO.trackName
        mArtistName.text = resultsDTO.artistName


    }

}