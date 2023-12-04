package com.example.AppRuben.CalculatorApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.AppRuben.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.DecimalFormat

class PruebaActivity : AppCompatActivity() {
    private lateinit var tvNumUno :EditText
    private lateinit var tvNumDos :EditText
    private lateinit var tvResult :TextView
    private lateinit var btnSum :FloatingActionButton
    private lateinit var btnRest :FloatingActionButton
    private lateinit var btnMult :FloatingActionButton
    private lateinit var btnDiv :FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prueba)
        initComponent()
        initListener()
    }
    private fun initComponent(){
        tvNumUno = findViewById(R.id.numUno)
        tvNumDos = findViewById(R.id.numDos)
        tvResult = findViewById(R.id.tvResult)
        btnSum = findViewById(R.id.btnSum)
        btnRest = findViewById(R.id.btnRest)
        btnDiv = findViewById(R.id.btnDiv)
        btnMult = findViewById(R.id.btnMult)

    }
    private fun initListener(){
        btnSum.setOnClickListener {
            val num1:Double = tvNumUno.text.toString().toDoubleOrNull() ?: 0.0
            val num2:Double = tvNumDos.text.toString().toDoubleOrNull() ?: 0.0
            tvResult.text= (num1+num2).toString()
        }
        btnRest.setOnClickListener {
            val num1:Double = tvNumUno.text.toString().toDoubleOrNull() ?: 0.0
            val num2:Double = tvNumDos.text.toString().toDoubleOrNull() ?: 0.0
            tvResult.text= (num1-num2).toString()
        }
        btnMult.setOnClickListener {
            val num1:Double = tvNumUno.text.toString().toDoubleOrNull() ?: 0.0
            val num2:Double = tvNumDos.text.toString().toDoubleOrNull() ?: 0.0
            tvResult.text= (num1*num2).toString()
        }
        btnDiv.setOnClickListener {
            val num1:Double = tvNumUno.text.toString().toDoubleOrNull() ?: 0.0
            val num2:Double = tvNumDos.text.toString().toDoubleOrNull() ?: 0.0
            val df = DecimalFormat("#.##")
            tvResult.text= df.format(num1/num2)
        }
    }

}