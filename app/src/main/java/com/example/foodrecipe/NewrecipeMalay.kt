package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class NewrecipeMalay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newrecipe_malay)

        val Create = findViewById<Button>(R.id.buttoncreate)
        val Potato = findViewById<CheckBox>(R.id.check1)
        val Salt = findViewById<CheckBox>(R.id.check2)
        val Tomato = findViewById<CheckBox>(R.id.check3)
        val Method = findViewById<EditText>(R.id.ed_1)
        val Display = findViewById<TextView>(R.id.result)
        val Display2 = findViewById<TextView>(R.id.result2)
        val Back = findViewById<Button>(R.id.buttonback)

        Create.setOnClickListener {

            val Potato = Potato.isChecked
            val Salt = Salt.isChecked
            val Tomato = Tomato.isChecked


            val orderString = "" +

                    (if(Potato) "\nPotato" else "") +
                    (if(Salt) "\nSalt" else "") +
                    (if(Tomato) "\nTomato" else "")



            Display.text = orderString

            val Message = Method.text
            Display2.text = Message

        }


        Back.setOnClickListener {

            val intent =  Intent (this,Recipetype::class.java)
            startActivity(intent)
        }
    }
}