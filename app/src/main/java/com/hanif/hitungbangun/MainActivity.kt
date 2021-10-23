package com.hanif.hitungbangun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bPersegi = findViewById<Button>(R.id.btn_persegi)
        val bSegitiga = findViewById<Button>(R.id.btn_segitiga)
        val bLingkaran = findViewById<Button>(R.id.btn_lingkaran)

        bPersegi.setOnClickListener {
            val intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }

        bSegitiga.setOnClickListener {
            val intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }

        bLingkaran.setOnClickListener {
            val intent = Intent(this,LingkaranActivity::class.java)
            startActivity(intent)
        }
    }
}