package com.example.android_retrofit2_example

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserAPI {
    @GET(".")
    fun getUser(@Query("results") results: Int): Call<RandomUserAPIResponse>
}