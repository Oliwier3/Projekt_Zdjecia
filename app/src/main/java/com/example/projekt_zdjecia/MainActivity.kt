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

        val ob1 = "Obrazek 1 z 3"
        val ob2 = "Obrazek 2 z 3"
        val ob3 = "Obrazek 3 z 3"

        var i=1;
        dalej.setOnClickListener {
            i++;
            if (i==1) {
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = ob1
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.kwiatyb)
                tekst.text = ob2
            }
            else if (i==3){
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = ob3
            }
            else if (i==4) {
                i = 1
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = ob1
            }
        }

        wstecz.setOnClickListener {
            i--
            if (i==1){
                zdj.setImageResource(R.drawable.kwiatya)
                tekst.text = ob1
            }
            else if (i==2){
                zdj.setImageResource(R.drawable.kwiatyb)
                tekst.text = ob2
            }
            else if (i==3){
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = ob3
            }
            else if (i==0) {
                i = 3
                zdj.setImageResource(R.drawable.kwiatyc)
                tekst.text = ob1
            }
        }

    }
}