package com.tecnica2.expomap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class proyectosElectronica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proyectos_electronica)

        //botones
        val btnBackButton = findViewById<ImageView>(R.id.backButton)

        //volver
        btnBackButton.setOnClickListener {
            finish()
        }
    }
}