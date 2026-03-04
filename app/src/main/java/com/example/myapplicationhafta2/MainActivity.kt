package com.example.myapplicationhafta2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCovid = findViewById<Button>(R.id.btnCovid)
        val btnInfo = findViewById<Button>(R.id.btnInfo)
        val btnAskExpert = findViewById<Button>(R.id.btnAskExpert)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val btnSymptoms = findViewById<Button>(R.id.btnSymptoms)
        val btnExperience = findViewById<android.widget.Button>(R.id.btnExperience)
        val btnCalendar = findViewById<Button>(R.id.btnCalendar)
        val btnBloodTest = findViewById<android.widget.Button>(R.id.btnBloodTest)
        val btnContact = findViewById<android.widget.Button>(R.id.btnContact)
        val btnAbout = findViewById<android.widget.Button>(R.id.btnAbout)

        btnCovid.setOnClickListener {
            val intent = Intent(this, CovidInfoActivity::class.java)
            startActivity(intent)
        }

        btnInfo.setOnClickListener {
            val intent = android.content.Intent(this, BreastCancerInfoActivity::class.java)
            startActivity(intent)
        }

        btnAskExpert.setOnClickListener {
            val intent = Intent(this, AskExpertActivity::class.java)
            startActivity(intent)
        }

        btnLogout.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        btnSymptoms.setOnClickListener {
            val intent = Intent(this, SymptomManagementActivity::class.java)
            startActivity(intent)
        }
        btnExperience.setOnClickListener {
            val intent = android.content.Intent(this, PatientExperienceActivity::class.java)
            startActivity(intent)
        }
        btnCalendar.setOnClickListener {
            val intent = android.content.Intent(this, CalendarActivity::class.java)
            startActivity(intent)
        }
        btnBloodTest.setOnClickListener {
            val intent = android.content.Intent(this, BloodTestActivity::class.java)
            startActivity(intent)
        }
        btnContact.setOnClickListener {
            val intent = android.content.Intent(this, ContactActivity::class.java)
            startActivity(intent)
        }
        btnAbout.setOnClickListener {
            val intent = android.content.Intent(this, AboutActivity::class.java)
            startActivity(intent)
        }
    }
}