package com.example.actvidadesandroid

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity(), OnClickListener {

    private lateinit var boton : Button
    private lateinit var texto : TextView
    private lateinit var boton3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.iv_boton)
        texto = findViewById(R.id.iv_texto)
        boton3 = findViewById(R.id.button3)
        initEvent()

    }
    private fun initEvent(){
        boton.setOnClickListener{
            Toast.makeText(this, "Hola!!!!",Toast.LENGTH_LONG).show()
        }
        boton3.setOnClickListener(this)

    }

    fun saludar(view: View) {
        if (view. id == R.id. iv_boton) {//podría quitarlo, porque sólo lo referencia un sólo botón desde la interfaz
            Toast.makeText( this, "No quiero saludar!!!",Toast.LENGTH_LONG).show()
        }
        else{
            Toast.makeText( this, "quiero saludar!!!",Toast.LENGTH_LONG).show()

        }
    }

    override fun onClick(p0: View?) {
        if (p0?.id == R.id.button3){
            Toast.makeText(this,"Saludo boton3", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(this,"Saludo boton4", Toast.LENGTH_LONG).show()

        }
    }



}