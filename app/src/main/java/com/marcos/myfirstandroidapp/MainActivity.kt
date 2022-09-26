package com.marcos.myfirstandroidapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //LA APLICACION NOS DICE EL TIEMPO QUE LA APLICACION ESTUVO PAUSADA CUANDO LE DAMOS AL BOTON DE
    // TIME, REINICIANDOSE EL CONTADOR DE TIEMPO CADA VEZ QUE VOLVEMOS A ELLA DE NUEVO

    var horaInicial: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) { //la interrogacion significa que la
        // variable llamada savedInstanceState, de tipo Bundle, puede ser "null""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado", "Oncreate")
        val miBoton:Button = findViewById(R.id.containedButton)
        val miTexto:TextView = findViewById(R.id.textView)
        miBoton.text = "SHOW TIME PAUSED"
        miTexto.text = "¡BIENVENIDO!"
    }

    override fun onPause() {
        super.onPause()
        horaInicial = System.currentTimeMillis()

        val miTexto:TextView = findViewById(R.id.textView)
        miTexto.text = "MANTEN LA APP PAUSADA DURANTE UNOS SEGUNDOS"
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado", "onStart")
        val horaFinal: Long = System.currentTimeMillis()
        val t = (horaFinal - horaInicial) / 1000
        Log.d("Time", "Time lapsed = $t s")

        val miBoton:Button = findViewById(R.id.containedButton)
        val miTexto:TextView = findViewById(R.id.textView)

        miBoton.setOnClickListener {
            miTexto.text = "La aplicacion estuvo pausada $t seg"
        }
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado", "onResume")
        val miTexto:TextView = findViewById(R.id.textView)
    }


}