package com.example.foodrecipe


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val Button = findViewById<Button>(R.id.button)
        Button.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)

            startActivity(intent)
        }


        }








    }