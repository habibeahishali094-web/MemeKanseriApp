package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CovidInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid_info)

        // Geri tuşunu arayüzde buluyoruz
        val btnBack = findViewById<TextView>(R.id.btnBack)

        // Geri tuşuna tıklandığında ne olacak?
        btnBack.setOnClickListener {
            finish() // Bu sayfayı kapatır ve geldiğimiz yere (Ana Sayfaya) geri döner
        }
    }
}