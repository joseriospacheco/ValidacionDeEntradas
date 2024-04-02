package com.example.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.roytuts.kotlin.validate.email.regex.EmailValidator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textNombres = findViewById<EditText>(R.id.text_nombres)
        var textEdad = findViewById<EditText>(R.id.text_edad)
        var textCorreo = findViewById<EditText>(R.id.text_correo)
        var btnRegistrar = findViewById<Button>(R.id.btn_registrar)

        btnRegistrar.setOnClickListener {

            if (!textNombres.text.isBlank() || !textEdad.text.isBlank() || !textCorreo.text.isBlank()){

                if(EmailValidator.isEmailValid(textCorreo.text.toString())){


                    var i = Intent(this,HomeActivity::class.java)
                    i.putExtra("nombres",textNombres.text.toString())
                    i.putExtra("edad",textEdad.text.toString().toInt())


                    startActivity(i)


                }else {

                    Toast.makeText(this,"El correo no tiene un formato valido",Toast.LENGTH_LONG).show()

                }

            }else{
                Toast.makeText(this,"Debe completar los datos",Toast.LENGTH_LONG).show()
            }



        }

    }
}