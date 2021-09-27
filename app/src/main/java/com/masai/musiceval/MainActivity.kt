package com.masai.musiceval

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.masai.musiceval.ApiNetwork.ApiService
import com.masai.musiceval.ApiNetwork.Network
import com.masai.musiceval.models.ResponseDTO
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.masai.musiceval.models.ResultsDTO

class MainActivity : AppCompatActivity(R.layout.activity_main) {



    private lateinit var recyclerView: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView =findViewById(R.id.recyclerView)

        callApi()
    }

    private fun callApi() {
        val apiClient = Network.getInstance().create(ApiService::class.java)
        val call = apiClient.getPosts(7)
        call.enqueue(object : Callback<ResponseDTO?> {
            override fun onResponse(call: Call<ResponseDTO?>, response: Response<ResponseDTO?>) {
                if(response.body()!=null){
                    response.body()?.let { setRecycler(it) }
                }

            }

            override fun onFailure(call: Call<ResponseDTO?>, t: Throwable) {

            }
        })



    }
    private  fun setRecycler(list: List<ResultsDTO>){

        val linearLayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = linearLayoutManager
        val myAdapter = MyAdapter(list)
        recyclerView.adapter = myAdapter
    }


}