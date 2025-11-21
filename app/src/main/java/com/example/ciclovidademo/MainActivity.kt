package com.example.ciclovidademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var txtEstado: TextView
    private val TAG = "CicloVida"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtEstado = findViewById(R.id.txtEstado)
        actualizarEstado("onCreate")
        Toast.makeText(this, "Activity Creada", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onCreate ejecutado")
    }

    override fun onStart() {
        super.onStart()
        actualizarEstado("onStart")
        Log.d(TAG, "onStart ejecutado")
    }

    override fun onResume() {
        super.onResume()
        actualizarEstado("onResume")
        Toast.makeText(this, "App en primer plano", Toast.LENGTH_SHORT).show()
        Log.d(TAG, "onResume ejecutado")
    }

    override fun onPause() {
        super.onPause()
        actualizarEstado("onPause")
        Log.d(TAG, "onPause ejecutado")
    }

    override fun onStop() {
        super.onStop()
        actualizarEstado("onStop")
        Log.d(TAG, "onStop ejecutado")
    }

    override fun onRestart() {
        super.onRestart()
        actualizarEstado("onRestart")
        Log.d(TAG, "onRestart ejecutado")
    }

    override fun onDestroy() {
        super.onDestroy()
        actualizarEstado("onDestroy")
        Log.d(TAG, "onDestroy ejecutado")
    }

    private fun actualizarEstado(estado: String) {
        txtEstado.text = estado
    }
}
