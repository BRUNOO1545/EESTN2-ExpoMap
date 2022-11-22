package com.tecnica2.expomap

import android.content.Intent
import android.opengl.Visibility
import android.os.Build.VERSION
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bienvenida)

        //region variables de botones

        val btnProyectosElectronica = findViewById<ImageView>(R.id.btnGotoElectronica)
        val btnProyectosElectromecanica = findViewById<ImageView>(R.id.btnGotoElectromecanica)
        val btnProyectosInformatica = findViewById<ImageView>(R.id.btnGotoInformatica)
        val btnProyectosMMobras = findViewById<ImageView>(R.id.btnGotoMMobras)
        val btnProyectosProgramacion = findViewById<ImageView>(R.id.btnGotoProgramacion)
        val btnMapa = findViewById<ImageView>(R.id.btnGotoMap)

        //endregion

        //region Botones

        //ir a los proyectos de Electronica
        btnProyectosElectronica.setOnClickListener {
            startActivity(Intent(this, proyectosElectronica::class.java))
        }

        //ir a los proyectos de Electromecanica
        btnProyectosElectromecanica.setOnClickListener {
            startActivity(Intent(this, proyectosElectromecanica::class.java))
        }

        //ir a los proyectos de Informatica
        btnProyectosInformatica.setOnClickListener {
            startActivity(Intent(this, proyectosInformatica::class.java))
        }

        //ir a los proyectos de MM obras
        btnProyectosMMobras.setOnClickListener {
            startActivity(Intent(this, proyectosMMObras::class.java))
        }

        //ir a los proyectos de Programacion
        btnProyectosProgramacion.setOnClickListener {
            startActivity(Intent(this, proyectosProgramacion::class.java))
        }

        //ir al mapa de la escuela
        if (VERSION.SDK_INT >= 24) {
            btnMapa.visibility = View.VISIBLE

            btnMapa.setOnClickListener {
                startActivity(Intent(this, mapaInteractivo::class.java))
            }
        }
        else {
            //en caso de android viejo, quita el mapa para no crasheo
            btnMapa.visibility = View.GONE
        }

        //endregion
    }
}