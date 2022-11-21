package com.playgendary.sportmastersa.zdsga

import org.json.JSONException
import org.json.JSONObject
import java.io.File
import com.appsflyer.AppsFlyerLib
import com.google.android.material.snackbar.Snackbar
import com.onesignal.OneSignal
import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import java.io.IOException
import android.os.*
import com.orhanobut.hawk.Hawk
import com.playgendary.sportmastersa.R
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.eeokadskoosdk
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.vkkdskosdkao
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.playgendary.sportmastersa.databinding.ActivityBhusaBinding
import com.playgendary.sportmastersa.zdsga.Mhsuiasd.Companion.alskaos



class Jhssdjas : AppCompatActivity() {

    lateinit var dfsgaash: ActivityBhusaBinding
    var woposapdlasdp: String? = null
    var chsudsduasuidjai: ValueCallback<Array<Uri>>? = null
    lateinit var kslsdkasdosdka: WebView
    private val kjdhuhsadua = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dfsgaash = ActivityBhusaBinding.inflate(layoutInflater)
        setContentView(dfsgaash.root)

        kslsdkasdosdka = dfsgaash.osdsks
        Snackbar.make(
            dfsgaash.root, "Loading...",
            Snackbar.LENGTH_LONG
        ).show()


        val qpsolkdsajhdas = CookieManager.getInstance()
        qpsolkdsajhdas.setAcceptCookie(true)
        qpsolkdsajhdas.setAcceptThirdPartyCookies(kslsdkasdosdka, true)
        xkijasoasdodk()
        val chjask: Activity = this
        kslsdkasdosdka.webViewClient = object : WebViewClient() {


            override fun shouldOverrideUrlLoading(fksos: WebView, xjhdshad: String): Boolean {
                try {
                    if (URLUtil.isNetworkUrl(xjhdshad)) {
                        return false
                    }
                    if (vksosdkasdko(xjhdshad)) {

                        val wosppdksdao = Intent(Intent.ACTION_VIEW)
                        wosppdksdao.data = Uri.parse(xjhdshad)
                        startActivity(wosppdksdao)
                    } else {

                        Toast.makeText(
                            applicationContext,
                            "Application is not installed",
                            Toast.LENGTH_LONG
                        ).show()
                        startActivity(
                            Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                            )
                        )
                    }
                    return true
                } catch (e: Exception) {
                    return false
                }
                fksos.loadUrl(xjhdshad)
            }


            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                vkksdskdo(url)
            }

            override fun onReceivedError(
                view: WebView,
                errorCode: Int,
                description: String,
                failingUrl: String
            ) {
                Toast.makeText(chjask, description, Toast.LENGTH_SHORT).show()
            }


        }
        kslsdkasdosdka.webChromeClient = object : WebChromeClient() {
            override fun onShowFileChooser(
                webView: WebView, filePathCallback: ValueCallback<Array<Uri>>,
                fileChooserParams: FileChooserParams
            ): Boolean {
                chsudsduasuidjai?.onReceiveValue(null)
                chsudsduasuidjai = filePathCallback
                var cjsisdjasi: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cjsisdjasi!!.resolveActivity(packageManager) != null) {


                    var wosdpdskoas: File? = null
                    try {
                        wosdpdskoas = xjxnck()
                        cjsisdjasi.putExtra("PhotoPath", woposapdlasdp)
                    } catch (ex: IOException) {

                    }

                    if (wosdpdskoas != null) {
                        woposapdlasdp = "file:" + wosdpdskoas.absolutePath
                        cjsisdjasi.putExtra(
                            MediaStore.EXTRA_OUTPUT,
                            Uri.fromFile(wosdpdskoas)
                        )
                    } else {
                        cjsisdjasi = null
                    }
                }
                val vjhdsiasa = Intent(Intent.ACTION_GET_CONTENT)
                vjhdsiasa.addCategory(Intent.CATEGORY_OPENABLE)
                vjhdsiasa.type = "image/*"
                val cjhdusaj: Array<Intent?> =
                    cjsisdjasi?.let { arrayOf(it) } ?: arrayOfNulls(0)
                val qospkdndsnaas = Intent(Intent.ACTION_CHOOSER)
                qospkdndsnaas.putExtra(Intent.EXTRA_INTENT, vjhdsiasa)
                qospkdndsnaas.putExtra(Intent.EXTRA_TITLE, getString(R.string.image_chooser))
                qospkdndsnaas.putExtra(Intent.EXTRA_INITIAL_INTENTS, cjhdusaj)
                startActivityForResult(
                    qospkdndsnaas, kjdhuhsadua
                )
                return true
            }

            @Throws(IOException::class)
            private fun xjxnck(): File {
                var wokdkao = File(
                    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                    "DirectoryNameHere"
                )
                if (!wokdkao.exists()) {
                    wokdkao.mkdirs()
                }

                wokdkao =
                    File(wokdkao.toString() + File.separator + "IMG_" + System.currentTimeMillis() + ".jpg")
                return wokdkao
            }

        }

        kslsdkasdosdka.loadUrl(vhvusiijdais())
    }


    private fun bjdiisjsd(string: String) {
        OneSignal.setExternalUserId(
            string,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(xksoldask: JSONObject) {
                    try {
                        if (xksoldask.has("push") && xksoldask.getJSONObject("push").has("success")) {
                            val wospdkjsda = xksoldask.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $wospdkjsda"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (xksoldask.has("email") && xksoldask.getJSONObject("email").has("success")) {
                            val cvjsuhd =
                                xksoldask.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $cvjsuhd"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (xksoldask.has("sms") && xksoldask.getJSONObject("sms").has("success")) {
                            val ausidodjsa = xksoldask.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $ausidodjsa"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }

    private fun xkijasoasdodk() {
        val qospdk = kslsdkasdosdka.settings
        qospdk.javaScriptEnabled = true

        qospdk.useWideViewPort = true
        qospdk.pluginState = WebSettings.PluginState.ON
        qospdk.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        qospdk.domStorageEnabled = true
        qospdk.userAgentString = qospdk.userAgentString.replace("; wv", "")

        qospdk.javaScriptCanOpenWindowsAutomatically = true
        qospdk.setSupportMultipleWindows(false)

        qospdk.displayZoomControls = false


        qospdk.loadWithOverviewMode = true
        qospdk.setAppCacheEnabled(true)

        qospdk.allowContentAccess = true
        qospdk.allowFileAccess = true
        qospdk.builtInZoomControls = true
        qospdk.setSupportZoom(true)



    }

    @SuppressLint("SuspiciousIndentation")
    private fun vhvusiijdais(): String {

        val clciojsjda = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)

        val ckjdisao:String? = Hawk.get(eeokadskoosdk, "null")
        val poldksakdsa: String? = Hawk.get(Mhsuiasd.wospld, "null")
        val cgshdhahus: String? = Hawk.get(Mhsuiasd.ksdjsjiadji, "null")
        val wospdja = "com.playgendary.sportmastersa"
        val lopdkas: String? = Hawk.get(alskaos, "null")
        val podlkasasd = AppsFlyerLib.getInstance().getAppsFlyerUID(this)
        val chsudds: String = Hawk.get(Mhsuiasd.qposldk, "null")
        AppsFlyerLib.getInstance().setCollectAndroidID(true)


        val cksidsoaokdkoads = "naming"
        val vlosdkas = "ad_id="
        val cbcxjcvx = "deviceID="
        val sdiisdjisdajsd = "sub_id_6="
        val diaoo = "sub_id_4="
        val aplsdkdsa = "sub_id_5="
        val sodasoidsa = "sub_id_1="
        val plskjdais = Build.VERSION.RELEASE

        val didudosaiads = Hawk.get(vkkdskosdkao, "null")
        var wospdklsp: String = ""
        if (chsudds == "1"){
            wospdklsp =
                "$didudosaiads$sodasoidsa$ckjdisao&$cbcxjcvx$podlkasasd&$vlosdkas$lopdkas&$diaoo$wospdja&$aplsdkdsa$plskjdais&$sdiisdjisdajsd$cksidsoaokdkoads"
            bjdiisjsd(podlkasasd.toString())
        } else {
            wospdklsp =
                "$didudosaiads$cbcxjcvx$cgshdhahus&$vlosdkas$poldksakdsa&$diaoo$wospdja&$aplsdkdsa$plskjdais&$sdiisdjisdajsd$cksidsoaokdkoads"
            bjdiisjsd(cgshdhahus.toString())
        }

        Log.d("TESTAG", "Test Result $wospdklsp")
        return clciojsjda.getString("SAVED_URL", wospdklsp).toString()
    }


    private fun vksosdkasdko(uri: String): Boolean {

        val dudsi = packageManager
        try {

            dudsi.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)


            return true
        } catch (e: PackageManager.NameNotFoundException) {

        }
        return false
    }



    var sidosksa = ""
    fun vkksdskdo(lskdjjaskdjas: String?) {
        if (!lskdjjaskdjas!!.contains("t.me")) {

            if (sidosksa == "") {
                sidosksa = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    AppCompatActivity.MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    lskdjjaskdjas
                ).toString()

                val wpsolsdaksd = getSharedPreferences("SP_WEBVIEW_PREFS", AppCompatActivity.MODE_PRIVATE)
                val wodkaspasdpl = wpsolsdaksd.edit()
                wodkaspasdpl.putString("SAVED_URL", lskdjjaskdjas)
                wodkaspasdpl.apply()
            }
        }
    }


    private var vksojdaisj = false
    override fun onBackPressed() {


        if (kslsdkasdosdka.canGoBack()) {
            if (vksojdaisj) {
                kslsdkasdosdka.stopLoading()
                kslsdkasdosdka.loadUrl(sidosksa)
            }
            this.vksojdaisj = true
            kslsdkasdosdka.goBack()
            Handler(Looper.getMainLooper()).postDelayed(Runnable {
                vksojdaisj = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    override fun onActivityResult(cnjxck: Int, lsopdsp: Int, wosdpdsp: Intent?) {
        if (cnjxck != kjdhuhsadua || chsudsduasuidjai == null) {
            super.onActivityResult(cnjxck, lsopdsp, wosdpdsp)
            return
        }
        var bjddksk: Array<Uri>? = null

        if (lsopdsp == AppCompatActivity.RESULT_OK) {
            if (wosdpdsp == null || wosdpdsp.data == null) {
                bjddksk = arrayOf(Uri.parse(woposapdlasdp))
            } else {
                val wokdsaod = wosdpdsp.dataString
                if (wokdsaod != null) {
                    bjddksk = arrayOf(Uri.parse(wokdsaod))
                }
            }
        }
        chsudsduasuidjai?.onReceiveValue(bjddksk)
        chsudsduasuidjai = null
    }


}