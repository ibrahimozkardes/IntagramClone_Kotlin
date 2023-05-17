package com.ibrahimozkardes.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class KaydolActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kaydol)

        val txt_geriGel = findViewById<TextView>(R.id.txt_kaydolGeri)
        txt_geriGel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val geriChar = '<'
        val txt_kaydolGeriGel = findViewById<TextView>(R.id.txt_kaydolGeri)
        txt_kaydolGeriGel.text = geriChar.toString()
    }

    override fun onBackPressed() {  // for opening previous activity with system back button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}