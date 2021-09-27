package com.masai.musiceval.ApiNetwork

import com.masai.musiceval.models.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/search?term=[from search view]")
    fun getPosts(@Query("term") term: String): Call<ResponseDTO>;
}