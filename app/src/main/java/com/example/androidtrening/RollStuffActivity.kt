package com.example.androidtrening

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class RollStuffActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_roll_stuff)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
        findViewById<TextView>(R.id.toll_text).apply {
            text = (1..6).random().toString()
        }
    }
}