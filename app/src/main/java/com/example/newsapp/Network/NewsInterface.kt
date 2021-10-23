package com.example.newsapp.Network

import com.example.newsapp.Model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET

interface NewsInterface {


    @GET("everything?q=Apple&from=2021-10-23&sortBy=popularity&apiKey=03d1b6f62ea240029aa43336baa39c5d")
    fun getNews():Call<NewsResponse>
}