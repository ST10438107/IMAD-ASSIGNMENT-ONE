package com.example.immortalshistoryapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Age = findViewById<EditText>(R.id.editTextNumber)
        val Generate = findViewById<Button>(R.id.button)
        val Immortal = findViewById<TextView>(R.id.textView2)
        val Clear = findViewById<Button>(R.id.button2)
        



    }
}