package com.example.medicproject

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.medicproject.R

class SignIn_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_)

        val SignIn = findViewById<Button>(R.id.signInBtn)
        var mail = findViewById<TextView>(R.id.emailSignIn)
        var password = findViewById<TextView>(R.id.passwordSignIn)
        var forgot = findViewById<TextView>(R.id.clickHere)



    }
}