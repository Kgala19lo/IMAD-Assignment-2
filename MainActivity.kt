package com.example.assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnEnter = findViewById<Button>(R.id.btnwoof)

        btnEnter.setOnClickListener {

            val intent = Intent(this@MainActivity, Page2::class.java)

            startActivity(intent)
        }
    }
}