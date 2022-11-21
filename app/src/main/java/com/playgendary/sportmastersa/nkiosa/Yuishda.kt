package com.playgendary.sportmastersa.nkiosa

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import com.playgendary.sportmastersa.databinding.ActivityYuishdaBinding
import kotlin.random.Random

class Yuishda : AppCompatActivity() {
    var udshhuasd = 1.0f
    var osdakkoasd = 1.0f
    var ysdgys = 1.0f
    var wosdp = 1.0f
    var jsdaiasdji = 1.0f
    var woposadkasdo = 1.0f
    var vjhsdahjsd = 1.0f
    var woododasko = 1.0f
    var ncjjsal = 1.0f
    var eosps = 1.0f
    var kosadk = 1.0f
    var qpsaodso = 1.0f
    private lateinit var cksio : ActivityYuishdaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        cksio = ActivityYuishdaBinding.inflate(layoutInflater)
        setContentView(cksio.root)
        cksio.ksak.scaleX = udshhuasd
        cksio.ksak.scaleY = osdakkoasd
        cksio.vksodko.scaleX = ysdgys
        cksio.vksodko.scaleY = wosdp
        cksio.mkkkosd.scaleX = jsdaiasdji
        cksio.mkkkosd.scaleY = woposadkasdo
        cksio.lsosdpds.scaleX = vjhsdahjsd
        cksio.lsosdpds.scaleY = woododasko
        cksio.njvoaksd.scaleX = ncjjsal
        cksio.njvoaksd.scaleY = eosps
        cksio.lsodsp.scaleX = kosadk
        cksio.lsodsp.scaleY = qpsaodso
        jisdaijasdjisd()
        cksio.ijsdi.setOnClickListener {
            startActivity(Intent(this,Vfysuai::class.java))
        }
    }


    @SuppressLint("ClickableViewAccessibility")
    private fun jisdaijasdjisd() = with(cksio){
        ksak.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(udshhuasd >=0.0f && osdakkoasd >=0.0f) {
                        udshhuasd -= 0.10f
                        osdakkoasd -= 0.10f
                        ksak.scaleX = udshhuasd
                        ksak.scaleY = osdakkoasd
                        val tv1_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv1_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv1_coin
                        tvBonus.text = tv1_bonus
                    } else {
                        ksak.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java)
                        )
                    }


                }

                return true
            }

        })


        vksodko.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(ysdgys >=0.0f && wosdp >=0.0f) {
                        ysdgys -= 0.10f
                        wosdp -= 0.10f
                        vksodko.scaleX = ysdgys
                        vksodko.scaleY = wosdp
                        val tv2_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv2_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv2_coin
                        tvBonus.text = tv2_bonus
                    } else {
                        vksodko.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java))
                    }


                }

                return true
            }

        })


        mkkkosd.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(jsdaiasdji >=0.0f && woposadkasdo >=0.0f) {
                        jsdaiasdji -= 0.10f
                        woposadkasdo -= 0.10f
                        mkkkosd.scaleX = jsdaiasdji
                        mkkkosd.scaleY = woposadkasdo
                        val tv3_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv3_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv3_coin
                        tvBonus.text = tv3_bonus
                    } else {
                        mkkkosd.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java))
                    }


                }

                return true
            }

        })

        lsosdpds.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(vjhsdahjsd >=0.0f && woododasko >=0.0f) {
                        vjhsdahjsd -= 0.10f
                        woododasko -= 0.10f
                        lsosdpds.scaleX = vjhsdahjsd
                        lsosdpds.scaleY = woododasko
                        val tv4_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv4_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv4_coin
                        tvBonus.text = tv4_bonus
                    } else {
                        lsosdpds.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java))
                    }


                }

                return true
            }

        })
        njvoaksd.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(ncjjsal >=0.0f && eosps >=0.0f) {
                        ncjjsal -= 0.10f
                        eosps -= 0.10f
                        njvoaksd.scaleX = ncjjsal
                        njvoaksd.scaleY = eosps
                        val tv5_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv5_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv5_coin
                        tvBonus.text = tv5_bonus
                    } else {
                        njvoaksd.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java))
                    }


                }

                return true
            }

        })

        lsodsp.setOnTouchListener(object : View.OnTouchListener {
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                if(event?.action == MotionEvent.ACTION_DOWN) {
                    if(kosadk >=0.0f && qpsaodso >=0.0f) {
                        kosadk -= 0.10f
                        qpsaodso -= 0.10f
                        lsodsp.scaleX = kosadk
                        lsodsp.scaleY = qpsaodso
                        val tv6_coin = Bhyuais.listCoins[Random.nextInt(13)]
                        val tv6_bonus = Bhyuais.listBonus[Random.nextInt(7)]
                        tvCoin.text = tv6_coin
                        tvBonus.text = tv6_bonus
                    } else {
                        lsodsp.visibility = View.GONE
                    }


                    if(ksak.visibility == View.GONE &&vksodko.visibility == View.GONE &&mkkkosd.visibility == View.GONE &&lsosdpds.visibility == View.GONE &&njvoaksd.visibility == View.GONE &&lsodsp
                            .visibility == View.GONE){
                        startActivity(Intent(this@Yuishda, Vfysuai::class.java))
                    }


                }

                return true
            }

        })
    }



}