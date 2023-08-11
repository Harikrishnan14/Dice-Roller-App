package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

//Main screen of the app, letting user to roll dice and view the result
class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView //Usage of 'lateinit' helps us to skip the null check
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button2)

        rollButton.setOnClickListener {
            /* to show the message "Dice Rolled" on clicking the button */
            val toast = Toast.makeText(this, "Dice Rolled", Toast.LENGTH_SHORT)
            toast.show()

            rollDice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rollDice() {

        //choosing a random number b/w 1 and 6 and storing it in drawableResource
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

    }
}
