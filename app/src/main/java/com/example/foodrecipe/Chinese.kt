package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Chinese : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinese)

        val button = findViewById<Button>(R.id.newrecipe)

        button.setOnClickListener {

            val intent = Intent (this,NewrecipeChinese::class.java)
            startActivity(intent)
        }
    }
}