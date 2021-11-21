package com.example.my_application2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Inscription : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription)

        val connected = findViewById<Button>(R.id.Connected);

        connected.setOnClickListener(){
            Toast.makeText(this, "Inscription vers Connexion", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Connexion::class.java)
            startActivity(intent)
        }
    }
}