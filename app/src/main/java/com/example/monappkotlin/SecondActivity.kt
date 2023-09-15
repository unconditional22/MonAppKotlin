package com.example.monappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // btn retour
        val buttonRetour: Button = findViewById(R.id.button2)
        buttonRetour.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // btn suivant
        val buttonSuivant: Button = findViewById(R.id.button3)
        buttonSuivant.setOnClickListener {
            Toast.makeText(this, "Bientot! Visitez plus tard!", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Alert Dialog")
        alertDialogBuilder.setMessage("Ceci est un simple alert dialog.")

        alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
            Toast.makeText(this, "OK button cliqué!", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }
}