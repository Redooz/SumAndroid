package com.redoz.sumandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    private lateinit var editTxtNum1: EditText
    private lateinit var editTxtNum2: EditText
    private lateinit var btnSum: MaterialButton
    private lateinit var txtVResult: TextView

    private var num1: Double = 0.0
    private var num2: Double = 0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSum = findViewById(R.id.btnSum)
        txtVResult = findViewById(R.id.txtVResult)
        editTxtNum1 = findViewById(R.id.editTxtNum1)
        editTxtNum2 = findViewById(R.id.editTxtNum2)
    }


    fun sum(view: View) {
        num1 = editTxtNum1.text.toString().toDouble()
        num2 = editTxtNum2.text.toString().toDouble()

        var result = num1 + num2

        txtVResult.text = result.toString()
    }
}