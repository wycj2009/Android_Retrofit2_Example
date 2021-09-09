package com.example.android_retrofit2_example

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    val randomUserAPI: RandomUserAPI

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("http://api.randomuser.me/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        randomUserAPI = retrofit.create(RandomUserAPI::class.java)
    }

}