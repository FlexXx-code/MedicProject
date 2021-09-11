package com.example.medicproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Calander : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calander)

        val Save=findViewById<Button>(R.id.SaveBtn)
        var appointmentName=findViewById<TextView>(R.id.appointment)
        var Description=findViewById<TextView>(R.id.Description)

    }
}