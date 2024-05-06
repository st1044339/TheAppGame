package com.st10443396.theappgame

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private var health = 100
    private var hunger = 0
    private var cleanliness = 100


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val etSheep: ImageView = findViewById(R.id.etSheep)
        val btnFeed: Button = findViewById(R.id.btnFeed)
        val btnBath: Button = findViewById(R.id.btnBath)
        val btnPlay: Button = findViewById(R.id.btnPlay)


        btnFeed.setOnClickListener {
            feedPet()
            etSheep.setImageResource(R.drawable.sheep_eating)
        }

        btnBath.setOnClickListener {
            bathPet()
            etSheep.setImageResource(R.drawable.sheep_bathing)
        }

        btnPlay.setOnClickListener {
            playWithPet()
            etSheep.setImageResource(R.drawable.sheep_playing)
        }

        updateStatusText()
    }

    private fun feedPet() {
        hunger -= 20
        if (hunger < 0) hunger = 0
        health += 10
        if (health > 100) health = 100
        updateStatusText()
    }


    private fun bathPet(){
        cleanliness = 100
        health += 5
        if (health > 100) health = 100
        updateStatusText()
    }

    private fun playWithPet(){
        health -= 10
        if (health <0) health = 0
        hunger += 20
        if (hunger > 100) hunger = 100
        cleanliness -= 10
        if (cleanliness < 0) cleanliness = 10
        updateStatusText()
    }

    private fun updateStatusText() {
        val statusText: TextView = findViewById(R.id.tvDisplay)
        statusText.text = "Health $health Hunger $hunger Cleanliness $cleanliness"
    }
}