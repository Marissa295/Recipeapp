package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Indian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indian)

        val button = findViewById<Button>(R.id.newrecipe)

        button.setOnClickListener {

            val intent = Intent (this,Newrecipe::class.java)
            startActivity(intent)
        }
    }
}