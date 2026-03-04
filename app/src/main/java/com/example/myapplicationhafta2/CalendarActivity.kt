package com.example.myapplicationhafta2

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CalendarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val calendarView = findViewById<CalendarView>(R.id.calendarView)
        val tvSelectedDate = findViewById<TextView>(R.id.tvSelectedDate)
        val btnAddNote = findViewById<Button>(R.id.btnAddNote)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Takvimden Tarih Seçildiğinde Çalışacak Kod
        calendarView.setOnDateChangeListener { _, year, month, dayOfMonth ->
            // Ay indeksi 0'dan başladığı için +1 ekliyoruz
            val seciliTarih = "$dayOfMonth/${month + 1}/$year"
            tvSelectedDate.text = "Seçili Tarih: $seciliTarih"
        }

        // Not Ekle Butonu
        btnAddNote.setOnClickListener {
            val mevcutYazi = tvSelectedDate.text.toString()
            if (mevcutYazi.contains("Seçili Tarih")) {
                Toast.makeText(this, "$mevcutYazi için not ekranı açılıyor...", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Lütfen önce takvimden bir gün seçin.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}