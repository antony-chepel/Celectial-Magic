package com.playgendary.sportmastersa.nkiosa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.playgendary.sportmastersa.databinding.ActivityVfysuaiBinding
import kotlin.random.Random

class Vfysuai : AppCompatActivity() {
    private lateinit var njuis : ActivityVfysuaiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        njuis = ActivityVfysuaiBinding.inflate(layoutInflater)
        setContentView(njuis.root)
        njuis.bBack.setOnClickListener {
            startActivity(Intent(this,Kiospdas::class.java))
        }

        njuis.ksdos.text = Bhyuais.listCoins[Random.nextInt(13)]
        njuis.kjdjiasdjas.text = Bhyuais.listBonus[Random.nextInt(7)]
    }
}