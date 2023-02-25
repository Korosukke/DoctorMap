package com.example.doctormap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Audiologists : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audiologists)
        var btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            intent  = Intent(this, acti)
        }
    }
}