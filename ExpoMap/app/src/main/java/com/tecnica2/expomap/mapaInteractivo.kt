package com.tecnica2.expomap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlin.math.max
import kotlin.math.min

class mapaInteractivo : AppCompatActivity() {

    private lateinit var scaleGestureDetector: ScaleGestureDetector

    private var scaleFactor = 1.0f
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mapa_interactivo)

        imageView = findViewById(R.id.expoMap)
        scaleGestureDetector = ScaleGestureDetector(this, ScaleListener())

        //region buttons
        val btnMenuButton = findViewById<ImageView>(R.id.menuButton)
        val btnBackButton = findViewById<ImageView>(R.id.backButton)

        //menu desplegable
        val bsMenuDesplegable = menuAyudaMapaInteractivo()

        btnMenuButton.setOnClickListener {
            bsMenuDesplegable.show(supportFragmentManager, "menuAyudaMapaInteractivo")

            //startActivity(Intent(this, menuAyudaMapaInteractivo::class.java))
        }

        //volver
        btnBackButton.setOnClickListener {
            finish()
        }

        //endregion
    }

    //region Zoom

    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        scaleGestureDetector.onTouchEvent(motionEvent)
        return true
    }

    private inner class ScaleListener : SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            scaleFactor *= scaleGestureDetector.scaleFactor
            scaleFactor = max(1.0f, min(scaleFactor, 3.0f))
            imageView.scaleX = scaleFactor
            imageView.scaleY = scaleFactor
            return true
        }
    }

    //endregion

}