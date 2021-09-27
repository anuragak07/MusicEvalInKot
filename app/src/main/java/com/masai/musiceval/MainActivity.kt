package com.masai.musiceval

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.masai.musiceval.models.ResultsDTO

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
private  fun setRecyclerView(list: List<ResultsDTO>){
    val layoutManager=LinearLayoutManager(this)

}
}