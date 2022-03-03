package com.example.my_application2

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class Inscription : Activity() {




    // [START declare_auth]
    private lateinit var auth: FirebaseAuth
    // [END declare_auth]



    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inscription)
        // ...
        // Initialize Firebase Auth
        auth = Firebase.auth

        val inscription = findViewById<Button>(R.id.Inscription)
        val Connected = findViewById<Button>(R.id.Connected)

        Connected.setOnClickListener() {
            Toast.makeText(this, "Inscription vers Connexion", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Connexion::class.java)
            startActivity(intent)
        }



        inscription.setOnClickListener() {


            val mail = findViewById<EditText>(R.id.Mail).getText();
            println(mail);
            val password = findViewById<EditText>(R.id.Password).getText();
            println(password);
            createAccount(mail.toString(), password.toString())

            //Redirection vers Connexion
            Toast.makeText(this, "Main vers Connexion", Toast.LENGTH_LONG).show()
            val intent = Intent(this, Connexion::class.java)
            startActivity(intent)
        }


    }

    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser: FirebaseUser? = auth.currentUser
        if (currentUser != null) {
            reload()
        }
    }

    private fun createAccount(email: String, password: String) {
        // [START create_user_with_email]
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    Log.d(TAG, "createUserWithEmail:success")
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.
                    Log.w(TAG, "createUserWithEmail:failure", task.exception)
                    Toast.makeText(baseContext, "Authentication failed.",
                        Toast.LENGTH_SHORT).show()
                    updateUI(null)
                }
            }
        // [END create_user_with_email]
    }


    private fun updateUI(user: FirebaseUser?) {

    }

    private fun reload() {

    }


}


