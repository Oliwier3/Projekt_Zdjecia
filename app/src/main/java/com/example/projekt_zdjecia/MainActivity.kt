package com.example.projekt_zdjecia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wstecz = findViewById<Button>(R.id.wstecz)
        val dalej = findViewById<Button>(R.id.dalej)
        val zdj = findViewById<ImageView>(R.id.imageView)
        val tekst = findViewById<TextView>(R.id.textView)

        var i=1;
        dalej.setOnClickListener {
            i++;
            if (i==1) {
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = "Obrazek 1/3"
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.kwiatyb)
                tekst.text = "Obrazek 2/3"
            }
            else if (i==3){
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = "Obrazek 3/3"
            }
            else if (i==4) {
                i = 1
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = "Obrazek 1/3"
            }
        }

        wstecz.setOnClickListener {
            i--
            if (i==1){
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = "Obrazek 1/3"
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.kwiatyb)
                tekst.text = "Obrazek 2/3"
            }
            else if (i==3){
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = "Obrazek 3/3"
            }
            else if (i==0) {
                i = 3
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = "Obrazek 3/3"
            }
        }

    }
}