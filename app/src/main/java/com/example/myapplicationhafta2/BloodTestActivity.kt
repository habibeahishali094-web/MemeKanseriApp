package com.example.myapplicationhafta2
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class BloodTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blood_test)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val btnAddNewTest = findViewById<LinearLayout>(R.id.btnAddNewTest)
        val btnPastTests = findViewById<LinearLayout>(R.id.btnPastTests)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Yeni Tahlil Ekle
        btnAddNewTest.setOnClickListener {
            Toast.makeText(this, "Kamera veya Galeri açılacak...", Toast.LENGTH_SHORT).show()
        }

        // Geçmiş Tahliller
        btnPastTests.setOnClickListener {
            Toast.makeText(this, "Geçmiş tahlil listesi yükleniyor...", Toast.LENGTH_SHORT).show()
        }
    }
}