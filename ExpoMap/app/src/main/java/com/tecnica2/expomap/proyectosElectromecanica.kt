package com.tecnica2.expomap

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class proyectosElectromecanica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.proyectos_electromecanica)

        //botones
        val btnBackButton = findViewById<ImageView>(R.id.backButton)

        //volver
        btnBackButton.setOnClickListener {
            finish()
        }
    }
}