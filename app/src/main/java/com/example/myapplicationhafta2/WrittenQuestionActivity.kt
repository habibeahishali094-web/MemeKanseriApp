package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WrittenQuestionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_written_question)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val etQuestion = findViewById<EditText>(R.id.etQuestion)
        val btnSendQuestion = findViewById<Button>(R.id.btnSendQuestion)

        // Geri Tuşu İşlevi
        btnBack.setOnClickListener {
            finish()
        }

        // Gönder Butonu İşlevi
        btnSendQuestion.setOnClickListener {
            val questionText = etQuestion.text.toString().trim()

            if (questionText.isNotEmpty()) {
                // Şimdilik sadece mesaj veriyoruz (İleride Firebase'e kaydedilecek)
                Toast.makeText(this, "Sorunuz uzmana başarıyla iletildi!", Toast.LENGTH_LONG).show()
                finish() // İşlem bitince sayfayı kapatıp geri dön
            } else {
                Toast.makeText(this, "Lütfen göndermeden önce sorunuzu yazın.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}