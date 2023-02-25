package com.example.doctormap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var spinner = findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter.createFromResource(this,
            R.array.doctors, android.R.layout.simple_spinner_item)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter= adapter

        var submit = findViewById<Button>(R.id.Submit)
        submit.setOnClickListener {
            var doc = spinner.selectedItem.toString()
            if(doc == "Physician"){
                intent = Intent(this, Physician::class.java)
            }
            else if(doc == "Audiologists"){
                intent = Intent(this, Audiologists::class.java)
            }
            else if(doc == "Dentist"){
                intent = Intent(this, Dentist::class.java)
            }
            else if(doc == "Audiologists"){
                intent = Intent(this, Audiologists::class.java)
            }
            else if(doc == "ENT Specialist"){
                intent = Intent(this, ENT::class.java)
            }
            else if(doc == "Cardiologist"){
                intent = Intent(this, Cardiologist::class.java)
            }
            else if(doc == "Gynecologists"){
                intent = Intent(this, Gynecologists::class.java)
            }
            else if(doc == "Orthopedic Surgeon"){
                intent = Intent(this, Orthopedic::class.java)
            }
            else if(doc == "Psychiatrists"){
                intent = Intent(this, Psychiatrists::class.java)
            }



            startActivity(intent)
        }
    }
}