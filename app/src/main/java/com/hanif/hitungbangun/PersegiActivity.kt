package com.hanif.hitungbangun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class PersegiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        val inputSisi = findViewById<TextInputEditText>(R.id.sisi)
        val btnHitung = findViewById<Button>(R.id.hitungPersegi)
        val luasPersegi = findViewById<TextView>(R.id.persegiLuas)
        val kelilingPersegi = findViewById<TextView>(R.id.persegiKeliling)

        btnHitung.setOnClickListener {
            val valueSisi = inputSisi.text.toString()
            val intSisi = valueSisi.toInt()

            val luas = intSisi * intSisi
            val keliling = 4 * intSisi

            luasPersegi.text = "Luas : $luas"
            kelilingPersegi.text = "Keliling $keliling"
        }
    }
}