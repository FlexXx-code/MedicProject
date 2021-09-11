package com.example.medicproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val SignUpbutton=findViewById<Button>(R.id.signUp_btn)
        val Logbutton=findViewById<Button>(R.id.loginBtn)


        val swift=findViewById<Button>(R.id.loginBtn)
        swift.setOnClickListener{

            // var intent =  Intent(this@MainActivity , SignIn_Activity::class.java)
            startActivity(intent)
        }


        }
   

    }




