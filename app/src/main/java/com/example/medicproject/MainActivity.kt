package com.example.medicproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SignUpbutton = findViewById<Button>(R.id.signUp_btn)
        val Logbutton = findViewById<Button>(R.id.loginBtn)


    }

}


