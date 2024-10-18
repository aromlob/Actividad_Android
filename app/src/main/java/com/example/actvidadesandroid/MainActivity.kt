package com.example.actvidadesandroid

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

//Actvidad 5: Ciclo de Vida
private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    private lateinit var boton : Button
    private lateinit var texto : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.iv_boton)
        texto = findViewById(R.id.iv_texto)
        Log.d(TAG,"Metodo onCreate")
        boton.setOnClickListener {
            Toast.makeText(this, "Boton 1", Toast.LENGTH_SHORT).show()
            Log.d(TAG, "Boton 1")
        }
    }
    override fun onStart() {
        super.onStart()
        var claseA = ClaseA("Hola",10, true)

        claseA.setNumero(30)
        claseA.setCadena("Hello")
        claseA.setAfirmacion(false)
        Toast.makeText(this, claseA.toString(), Toast.LENGTH_LONG).show()
        Log.d(TAG, "Clase A OnStart -> ${claseA.toString()}")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG, "OnResume-> se puede interaccionar con la pantalla")
    }
    override fun onPause() {
        super.onPause()
        Log.d(TAG, "OnPause-> se pierde el foco de la pantalla por el boton home")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "OnRestart-> la aplicacion vuelve a estar visible.")
    }
    override fun onStop() {
        super.onStop()
        Log.d(TAG, "OnStop-> deja de estar visible")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "OnDEstroy-> la actividad muere")
    }
}