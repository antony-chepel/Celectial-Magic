package com.playgendary.sportmastersa.zdsga

import android.app.Application
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.orhanobut.hawk.Hawk
import java.util.*

class Mhsuiasd : Application() {
    companion object {

        var alskaos: String? = ""
        var qposldk = "appsChecker"
        var eeokadskoosdk: String? = "c11"
        const val kisdoasdk = "97757094596840711580"
        var ksdjsjiadji: String? = "myID"
        var wospld: String? = "instID"
        const val euusjda = "39d72e82-b572-4f24-8244-d691dc056ade"
        var vkkdskosdkao = "link"

    }

    override fun onCreate() {
        super.onCreate()

        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)
        OneSignal.initWithContext(this)
        OneSignal.setAppId(euusjda)

        Hawk.init(this).build()
        val sooksdoskad = getSharedPreferences("PREFS_NAME", 0)

        val osdoskd = MyTracker.getTrackerParams()
        val jcjnzxjnc = MyTracker.getTrackerConfig()
        val instID = MyTracker.getInstanceId(this)
        jcjnzxjnc.isTrackingLaunchEnabled = true
        if (sooksdoskad.getBoolean("my_first_time", true)) {
            val sldldksdlk = UUID.randomUUID().toString()
            osdoskd.setCustomUserId(sldldksdlk)
            Hawk.put(ksdjsjiadji, sldldksdlk)
            Hawk.put(wospld, instID)
            sooksdoskad.edit().putBoolean("my_first_time", false).apply()

        } else {
            val IDIN = Hawk.get(ksdjsjiadji, "null")
            osdoskd.setCustomUserId(IDIN)
        }
        MyTracker.initTracker(kisdoasdk, this)

    }
}