package com.example.myapplicationhafta2
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AudioRecordActivity : AppCompatActivity() {

    private var isRecording = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audio_record)

        val btnBack = findViewById<TextView>(R.id.btnBack)
        val chronometer = findViewById<Chronometer>(R.id.chronometer)
        val btnStartRecord = findViewById<Button>(R.id.btnStartRecord)
        val btnSendRecord = findViewById<Button>(R.id.btnSendRecord)

        // Geri Dön Tuşu
        btnBack.setOnClickListener {
            finish()
        }

        // Kayda Başla Butonu
        btnStartRecord.setOnClickListener {
            if (!isRecording) {
                // Kronometreyi sıfırla ve başlat
                chronometer.base = SystemClock.elapsedRealtime()
                chronometer.start()
                isRecording = true

                btnStartRecord.text = "Kaydediliyor..."
                btnStartRecord.setBackgroundColor(android.graphics.Color.RED)
                Toast.makeText(this, "Ses kaydı başladı, konuşabilirsiniz.", Toast.LENGTH_SHORT).show()
            }
        }

        // Bitir ve Gönder Butonu
        btnSendRecord.setOnClickListener {
            if (isRecording) {
                // Kronometreyi durdur
                chronometer.stop()
                isRecording = false

                Toast.makeText(this, "Ses kaydınız uzmana başarıyla iletildi!", Toast.LENGTH_LONG).show()
                finish() // Sayfayı kapatıp menüye dön
            } else {
                Toast.makeText(this, "Lütfen önce 'Kayda Başla' butonuna basın.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}