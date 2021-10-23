package com.hanif.hitungbangun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class LingkaranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        val inputJariJari = findViewById<TextInputEditText>(R.id.jarijari)
        val btnHitung = findViewById<Button>(R.id.hitungLingkaran)
        val luasLingkaran = findViewById<TextView>(R.id.lingkaranLuas)
        val kelilingLingkaran = findViewById<TextView>(R.id.lingkaranKeliling)

        btnHitung.setOnClickListener {
            val valueJariJari = inputJariJari.text.toString()
            val intJariJari = valueJariJari.toInt()

            val luas = (22/7) * intJariJari * intJariJari
            val keliling = 2 * (22/7) * intJariJari

            luasLingkaran.text = "Luas : $luas"
            kelilingLingkaran.text = "Keliling $keliling"
        }
    }
}