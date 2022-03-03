package com.example.my_application2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast.*
import android.widget.Toast as Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profil = findViewById<Button>(R.id.Profil);
        val ecritureTweet = findViewById<Button>(R.id.Button_EcrireTweet);


        profil.setOnClickListener(){
            Toast.makeText(this, "Button Clicked", LENGTH_LONG).show()
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }


        ecritureTweet.setOnClickListener(){
            Toast.makeText(this, "Main vers Ecriture Tweet", LENGTH_LONG).show()
            val intent = Intent(this, Activity_Ecriture_Tweet::class.java)
            startActivity(intent)
        }


    }
}