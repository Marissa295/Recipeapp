package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class Recipetype : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipetype)


        val Turkey = findViewById<ImageButton>(R.id.button_1)
        val Tuna = findViewById<ImageButton>(R.id.button_2)
        val Salmon = findViewById<ImageButton>(R.id.button_3)
        val Green = findViewById<ImageButton>(R.id.button_4)
        val Spring = findViewById<ImageButton>(R.id.button_5)
        val Prawn = findViewById<ImageButton>(R.id.button_6)
        val Indians = findViewById<ImageButton>(R.id.button_7)
        val Malays = findViewById<ImageButton>(R.id.button_8)
        val chinese = findViewById<ImageButton>(R.id.button_9)


        Turkey.setOnClickListener{
            val intent = Intent (this,Firstfood::class.java)
            startActivity(intent)
        }
        Tuna.setOnClickListener{
            val intent = Intent (this,Secondfood::class.java)
            startActivity(intent)
        }
        Salmon.setOnClickListener{
            val intent = Intent (this,Thirdfood::class.java)
            startActivity(intent)
        }
        Spring.setOnClickListener{
            val intent = Intent (this,Fourthfood::class.java)
            startActivity(intent)
        }
        Green.setOnClickListener{
            val intent = Intent (this,Fifthfood::class.java)
            startActivity(intent)
        }
        Prawn.setOnClickListener{
            val intent = Intent (this,Sixthfood::class.java)
            startActivity(intent)
        }

        Malays.setOnClickListener {
            val intent = Intent (this,Malay::class.java)
            startActivity(intent)
        }
        Indians.setOnClickListener {
            val intent = Intent (this,Indian::class.java)
            startActivity(intent)
        }
        chinese.setOnClickListener {
            val intent = Intent (this,Chinese::class.java)
            startActivity(intent)
            }


    }}
