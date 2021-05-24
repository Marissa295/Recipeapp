package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Malay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_malay)

        val button = findViewById<Button>(R.id.newrecipe)

        button.setOnClickListener {

            val intent = Intent (this,NewrecipeMalay::class.java)
            startActivity(intent)
        }
    }
}