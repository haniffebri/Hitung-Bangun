package com.hanif.hitungbangun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class SegitigaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        val inputAlas = findViewById<TextInputEditText>(R.id.alas)
        val inputTinggi = findViewById<TextInputEditText>(R.id.tinggi)
        val inputSisiMiring = findViewById<TextInputEditText>(R.id.sisimiring)
        val btnHitung = findViewById<Button>(R.id.hitungSegitiga)
        val luasSegitiga = findViewById<TextView>(R.id.segitigaLuas)
        val kelilingSegitiga = findViewById<TextView>(R.id.segitigaKeliling)

        btnHitung.setOnClickListener {
            val valueSisi = inputAlas.text.toString()
            val intSisi = valueSisi.toInt()

            val valueTinggi = inputTinggi.text.toString()
            val intTinggi = valueTinggi.toInt()

            val valueSisiMiring = inputSisiMiring.text.toString()
            val intSisiMiring = valueSisiMiring.toInt()

            val luas = intSisi * intTinggi/2
            val keliling = intSisi + intTinggi + intSisiMiring

            luasSegitiga.text = "Luas : $luas"
            kelilingSegitiga.text = "Keliling $keliling"
        }

    }
}