package com.example.projekt_zdjecia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wstecz = findViewById<Button>(R.id.wstecz)
        val dalej = findViewById<Button>(R.id.dalej)
        var i=1;
        dalej.setOnClickListener {
            i++;
        }
        wstecz.setOnClickListener {
            i--
        }

    }
}