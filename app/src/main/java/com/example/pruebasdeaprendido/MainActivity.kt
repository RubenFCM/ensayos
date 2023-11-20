package com.example.pruebasdeaprendido

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.pruebasdeaprendido.PruebasApp.PruebaActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnPrueba = findViewById<Button>(R.id.btnPrueba)
        btnPrueba.setOnClickListener { navigateToPruebaApp() }
    }

    private fun navigateToPruebaApp() {
        val intent = Intent(this,PruebaActivity::class.java)
        startActivity(intent)
    }

}