package com.redoz.sumandroid

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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


    @SuppressLint("ServiceCast")
    fun sum(view: View) {
        if (editTxtNum1.text.toString() == "" || editTxtNum2.text.toString() == "") {
            Toast.makeText(this, "Hay campos vacios", Toast.LENGTH_LONG).show()
            return
        }

        num1 = editTxtNum1.text.toString().toDouble()
        num2 = editTxtNum2.text.toString().toDouble()

        var result = num1 + num2

        txtVResult.text = result.toString()

        val inputMethodManager = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager

        // on below line hiding our keyboard.
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0)
    }
}