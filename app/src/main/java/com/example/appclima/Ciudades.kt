package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)
        val TAG = "com.example.appclima.ciudades.CIUDAD"
        val bValledupar = findViewById<Button>(R.id.button)
        bValledupar.setOnClickListener(View.OnClickListener {
            //Toast.makeText( this,"Valledupar",Toast.LENGTH_SHORT)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra(TAG, "valledupar")
            startActivity(intent)
        })


    }
}