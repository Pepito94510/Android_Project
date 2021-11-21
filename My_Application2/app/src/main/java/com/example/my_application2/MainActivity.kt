package com.example.my_application2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast.*
import android.widget.Toast as Toast
import android.widget.Toast.makeText as makeText1

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profil = findViewById<Button>(R.id.Profil);
        val inscription = findViewById<Button>(R.id.Inscription);

        profil.setOnClickListener(){
            Toast.makeText(this, "Button Clicked", LENGTH_LONG).show()
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }

        inscription.setOnClickListener(){
            Toast.makeText(this, "Main vers Inscription", LENGTH_LONG).show()
            val intent = Intent(this, Inscription::class.java)
            startActivity(intent)
        }
    }
}