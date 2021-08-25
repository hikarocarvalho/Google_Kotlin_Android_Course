package com.example.diceroller

import android.widget.ImageView

class Dice {
    fun roll(diceImage: ImageView, luck:Int){
        val dice = when((1..6).random()){
            luck -> R.drawable.dice_3
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
        // modify dice image
        diceImage.setImageResource(dice)
    }
}