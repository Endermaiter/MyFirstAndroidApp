package com.marcos.myfirstandroidapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var horaInicial: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) { //la interrogacion significa que la
                                                        // variable llamada savedInstanceState, de tipo Bundle, puede ser "null""
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Estado","Oncreate")
        horaInicial = System.currentTimeMillis()
    }

    override fun onPause() {
        super.onPause()
        val horaFinal:Long = System.currentTimeMillis()
        val t = (horaFinal-horaInicial)/1000
        Log.d("Time","Time lapsed = $t s")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d("Estado","onResume")
    }
}