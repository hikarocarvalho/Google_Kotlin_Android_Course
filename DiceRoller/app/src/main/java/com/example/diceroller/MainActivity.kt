package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // here I set one variable for the imageViewer
        val diceImage: ImageView = findViewById(R.id.diceImage)
        // here I set one variable for the element button
        val roll: Button = findViewById(R.id.roll)
        // here I define the luck number
        val luck = 3
        // here I will define what is going on when the button has clicked
        val firstDice = Dice()
        roll.setOnClickListener {
            firstDice.roll(diceImage,luck)

        }
    }
}
