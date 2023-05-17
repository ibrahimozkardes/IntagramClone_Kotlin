package com.ibrahimozkardes.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HesabiBulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hesabi_bul)

        val txt_geriGel = findViewById<TextView>(R.id.txt_hesabiBulGeri)
        txt_geriGel.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val geriChar = '<'
        val txt_HBgeriGel = findViewById<TextView>(R.id.txt_hesabiBulGeri)
        txt_HBgeriGel.text = geriChar.toString()
    }

    override fun onBackPressed() {  // for opening previous activity with system back button
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}