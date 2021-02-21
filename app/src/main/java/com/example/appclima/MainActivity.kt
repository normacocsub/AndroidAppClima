package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tvCiudad:TextView? = null
    var tvGrados:TextView? = null
    var tvEstatus:TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCiudad = findViewById(R.id.textViewCiudad)
        tvGrados = findViewById(R.id.textViewGrados)
        tvEstatus = findViewById(R.id.textViewClima)

        val ciudad = intent.getStringExtra("com.example.appclima.ciudades.CIUDAD")

        val ciudadvall = Ciudad("Valledupar", 35, "Soleado")

        if(ciudad == "valledupar"){
            tvCiudad?.text = ciudadvall.nombre
            tvGrados?.text = ciudadvall.grados.toString()
            tvEstatus?.text = ciudadvall.estatus
        }
        else{
            Toast.makeText(this,"No se encontro", Toast.LENGTH_SHORT).show()
        }

    }
}