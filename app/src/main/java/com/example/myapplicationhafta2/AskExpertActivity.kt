package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AskExpertActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask_expert)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val btnTextQuestion = findViewById<LinearLayout>(R.id.btnTextQuestion)
        val btnAudioQuestion = findViewById<LinearLayout>(R.id.btnAudioQuestion)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Yazılı Seçeneği
        btnTextQuestion.setOnClickListener {
            val intent = android.content.Intent(this, WrittenQuestionActivity::class.java)
            startActivity(intent)
        }



        // Sesli Seçeneği
        btnAudioQuestion.setOnClickListener {
            val intent = android.content.Intent(this, AudioRecordActivity::class.java)
            startActivity(intent)
        }
    }
}
