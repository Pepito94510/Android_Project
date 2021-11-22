package com.example.my_application2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class Inscription : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth;
// ...
// Initialize Firebase Auth

    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser


    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription)

        auth = Firebase.auth



        val connected = findViewById<Button>(R.id.Connected);





        connected.setOnClickListener(){
            Toast.makeText(this, "Inscription vers Connexion", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Connexion::class.java)
            startActivity(intent)
        }


    }
}