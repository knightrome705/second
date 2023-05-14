package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R.id.button
import com.example.myapplication.R.id.textView2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val catBtn:Button=findViewById<Button>(button)
        val view:TextView=findViewById<TextView>(textView2)
        catBtn.setOnClickListener{
           view.text="ulupundo?"
        }


    }
}