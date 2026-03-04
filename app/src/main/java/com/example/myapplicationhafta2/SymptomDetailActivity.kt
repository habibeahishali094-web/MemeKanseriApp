package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SymptomDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_detail)

        val btnBack = findViewById<TextView>(R.id.btnBack)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }
    }
}