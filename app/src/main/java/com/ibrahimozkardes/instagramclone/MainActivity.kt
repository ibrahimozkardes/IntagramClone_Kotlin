package com.ibrahimozkardes.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_kaydol = findViewById<Button>(R.id.btn_yeniHesap)
        btn_kaydol.setOnClickListener {
            val intent = Intent(this, KaydolActivity::class.java)
            startActivity(intent)
            finish()
        }

        val txt_sifremiUnuttum = findViewById<TextView>(R.id.txt_sifremiUnuttum)
        txt_sifremiUnuttum.setOnClickListener {
            val intent = Intent(this, HesabiBulActivity::class.java)
            startActivity(intent)
            finish()
        }

        var kullaniciID = findViewById<EditText>(R.id.txt_mainGiris)
        var PASSWORD = findViewById<EditText>(R.id.txt_mainGirisSifre)

        val btn_girisYap = findViewById<Button>(R.id.btn_giris)
        btn_girisYap.setOnClickListener {
            if (kullaniciID.text.toString() == "hello" && PASSWORD.text.toString() == "world") {
                val intent = Intent(this, anaSayfaActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}