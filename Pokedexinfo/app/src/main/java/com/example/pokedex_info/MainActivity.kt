package com.example.pokedex_info

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resposevalues = requestDataValue()
        for (i in resposevalues){

        }
    }
    fun requestDataValue(): String {
        var resultvalue = arrayListOf<Item>()
        var responsedata = ""
        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)
        val url = "https://pokeapi.co/api/v2/pokemon/ditto"

        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                // Display the first 500 characters of the response string.
                responsedata = response.substring(0, 500)
            },
            { responsedata = "Error in data request" })

        // Add the request to the RequestQueue.
        queue.add(stringRequest)
        responsedata?mapTo(resultvalue){
            ClipData.Item("abilities" to "abilities")
        }:resultvalue.put("error" to "error")
        return resultvalue
    }
}