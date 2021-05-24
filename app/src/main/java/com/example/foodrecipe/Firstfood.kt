package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Firstfood : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_firstfood)

        val Button = findViewById<Button>(R.id.button_back)
        Button.setOnClickListener{
            val intent = Intent (this,Recipetype::class.java)
            startActivity(intent)
        }
    }
}