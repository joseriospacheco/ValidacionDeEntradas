package com.example.myapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var txtDatosPersonales = findViewById<TextView>(R.id.txt_datos_personales)

        var datos = intent
        var nombre = datos.getStringExtra("nombres")
        var edad = datos.getIntExtra("edad",0)

        txtDatosPersonales.text="${nombre} - ${edad}"


    }
}