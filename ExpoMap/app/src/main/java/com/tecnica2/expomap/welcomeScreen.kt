package com.tecnica2.expomap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class welcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)

        //region variables de botones

        val btnProyectosElectronica = findViewById<Button>(R.id.btnGotoElectronica)
        val btnProyectosElectromecanica = findViewById<Button>(R.id.btnGotoElectromecanica)
        val btnProyectosInformatica = findViewById<Button>(R.id.btnGotoInformatica)
        val btnProyectosMMobras = findViewById<Button>(R.id.btnGotoMMobras)
        val btnProyectosProgramacion = findViewById<Button>(R.id.btnGotoProgramacion)
        val btnMapa = findViewById<Button>(R.id.btnGotoMap)

        //endregion

        //region Botones

        //ir a los proyectos de Electronica
        btnProyectosElectronica.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //ir a los proyectos de Electromecanica
        btnProyectosElectromecanica.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //ir a los proyectos de Informatica
        btnProyectosInformatica.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //ir a los proyectos de MM obras
        btnProyectosMMobras.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //ir a los proyectos de Programacion
        btnProyectosProgramacion.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //ir al mapa de la escuela
        btnMapa.setOnClickListener {
            val startActElectronica = Intent(this, proyectosElectronica::class.java)
            startActivity(startActElectronica)
        }

        //endregion
    }
}