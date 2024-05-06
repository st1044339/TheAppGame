package com.st10443396.theappgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var etAppName: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etAppName = findViewById(R.id.etAppName)

        val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            //call the next screen
            val intent = Intent(this,MainActivity2::class.java)
            //start your next activity
            startActivity(intent)
        }

    }
}