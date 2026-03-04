package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SymptomManagementActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptom_management)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val btnNausea = findViewById<LinearLayout>(R.id.btnNausea)
        val btnInfection = findViewById<LinearLayout>(R.id.btnInfection)

        // Geri Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Bulantı ve Kusma Seçeneği
        btnNausea.setOnClickListener {
            val intent = android.content.Intent(this, SymptomDetailActivity::class.java)
            startActivity(intent)
        }

        // Diğer bir seçenek
        btnInfection.setOnClickListener {
            Toast.makeText(this, "Enfeksiyon Detaylarına Gidiliyor...", Toast.LENGTH_SHORT).show()
        }
    }
}
