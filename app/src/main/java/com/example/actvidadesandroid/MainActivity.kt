package com.example.actvidadesandroid

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imageView : ImageView = findViewById(R.id.iv_imagen)
        imageView.setImageResource(R.drawable.imagen)
        val textView : TextView = findViewById(R.id.iv_text)
        textView.setText("Actividad 2 Cambio color")

    }
}