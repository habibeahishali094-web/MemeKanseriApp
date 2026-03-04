package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PatientExperienceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_experience)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val cardExperience1 = findViewById<CardView>(R.id.cardExperience1)
        val cardExperience2 = findViewById<CardView>(R.id.cardExperience2)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // 1. Videoya Tıklama
        cardExperience1.setOnClickListener {
            Toast.makeText(this, "1. Hasta Deneyimi Videosu Açılıyor...", Toast.LENGTH_SHORT).show()
        }

        // 2. Videoya Tıklama
        cardExperience2.setOnClickListener {
            Toast.makeText(this, "2. Hasta Deneyimi Videosu Açılıyor...", Toast.LENGTH_SHORT).show()
        }
    }
}