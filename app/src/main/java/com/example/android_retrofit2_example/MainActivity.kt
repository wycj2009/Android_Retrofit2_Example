package com.example.android_retrofit2_example

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainTextviewResponse: TextView
    private lateinit var activityMainButtonCall: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activityMainTextviewResponse = findViewById(R.id.activity_main_textview_response)
        activityMainButtonCall = findViewById(R.id.activity_main_button_call)

        activityMainButtonCall.setOnClickListener {
            call()
        }
    }

    private fun call() {
        val userSize = 5
        RetrofitBuilder.randomUserAPI.getUser(userSize).enqueue(object : Callback<RandomUserAPIResponse> {
            override fun onResponse(call: Call<RandomUserAPIResponse>, response: Response<RandomUserAPIResponse>) {
                val randomUserAPIResponse = response.body()!!

                val sb = StringBuilder()

                for (i in 0 until userSize) {
                    val fullName = randomUserAPIResponse.results!![i].name!!.run {
                        "$title. $first $last"
                    }
                    val thumbnail = randomUserAPIResponse.results!![i].picture!!.thumbnail
                    sb.appendLine("$fullName\n$thumbnail\n")
                }

                activityMainTextviewResponse.text = sb.toString()
            }

            override fun onFailure(call: Call<RandomUserAPIResponse>, t: Throwable) {
                activityMainTextviewResponse.text = "통신 실패\n${t}"
                Log.d("myLog", "통신 실패", t)
            }
        })
    }

}