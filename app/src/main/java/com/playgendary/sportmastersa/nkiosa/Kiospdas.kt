package com.playgendary.sportmastersa.nkiosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playgendary.sportmastersa.databinding.ActivityMainCelestScreenBinding

class Kiospdas : AppCompatActivity() {
    private lateinit var ksaj : ActivityMainCelestScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ksaj = ActivityMainCelestScreenBinding.inflate(layoutInflater)
        setContentView(ksaj.root)
        ksaj.button.setOnClickListener {
            startActivity(Intent(this,Yuishda::class.java))
        }

        ksaj.button2.setOnClickListener {
            finish()
        }
    }
}