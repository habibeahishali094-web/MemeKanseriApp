package com.example.myapplicationhafta2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class ContactActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val cardPhone = findViewById<CardView>(R.id.cardPhone)
        val cardEmail = findViewById<CardView>(R.id.cardEmail)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Telefonla Arama Ekranını Açma
        cardPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+905551234567") // Buraya gerçek numara yazılabilir
            startActivity(intent)
        }

        // E-Posta Gönderme Ekranını Açma
        cardEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = Uri.parse("mailto:destek@memekanseri.app")
            intent.putExtra(Intent.EXTRA_SUBJECT, "Mobil Uygulama Destek Talebi")
            startActivity(intent)
        }
    }
}