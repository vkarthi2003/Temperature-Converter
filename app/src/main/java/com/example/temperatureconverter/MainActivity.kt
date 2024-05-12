package com.example.temperatureconverter

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val layout:LinearLayout=findViewById(R.id.layout)
        val temp:TextView=findViewById(R.id.temp)
        val button2:Button=findViewById(R.id.button2)
        val button3: Button=findViewById(R.id.button3)
        val button4: Button=findViewById(R.id.button)


        button2.setOnClickListener {
            val input=temp.text.toString().toDoubleOrNull()
            if (input != null) temp.text = (input*9/5+32).toString() else temp.text = "Please enter the temperature"
        }

        button3.setOnClickListener {
            val input=temp.text.toString().toDoubleOrNull()
            if (input != null) {
                temp.text = ((input-32)*5/9).toString()
            } else{
                temp.text = "Please enter the temperature"
            }
        }
        button4.setOnClickListener {
            temp.text = ""
        }
    }
}