package com.example.AppRuben

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.AppRuben.Conversor.ConversorActivity
import com.example.AppRuben.CalculatorApp.PruebaActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalculosApp = findViewById<Button>(R.id.btnCalculosApp)
        btnCalculosApp.setOnClickListener { navigateToPruebaApp() }
        var btnConversorApp = findViewById<Button>(R.id.btnConversorApp)
        btnConversorApp.setOnClickListener { navigateToConversorApp() }
    }

    private fun navigateToPruebaApp() {
        val intent = Intent(this,PruebaActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToConversorApp() {
        val intent = Intent(this,ConversorActivity::class.java)
        startActivity(intent)
    }

}