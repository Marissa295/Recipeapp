package com.example.foodrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet
import android.text.Layout as Layout1

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val username = findViewById<EditText>(R.id.Username)
        val password = findViewById<EditText>(R.id.Password)
        val email = findViewById<EditText>(R.id.ed1)
        val login = findViewById<Button>(R.id.Login)




        email.addTextChangedListener(object:TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (android.util.Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches())
                    login.isEnabled = true


                else {
                    login.isEnabled = false
                    email.setError("Invalid Email")
                }



            }

            override fun afterTextChanged(s: Editable?) {

            }

        })


      login.setOnClickListener {
          val intent = Intent (this,Recipetype::class.java)
          startActivity(intent)

          Toast.makeText(this ,"Logged In Successfully" , Toast.LENGTH_LONG).show()
      }





        }



        }





