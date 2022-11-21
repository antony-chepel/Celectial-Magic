package com.playgendary.sportmastersa.bgfysu

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET

interface AppRetroInst {

    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun lsodspkso(): Response<Jusidoasdkoasd>

    @GET("const.json")
    suspend fun tsyhsdhuas(): Response<Wuisokdsao>
}

@Keep
data class Jusidoasdkoasd(
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("countryCode")
    val countryCode: String,
)
@Keep
data class Wuisokdsao(
    @SerializedName("geo")
    val geo: String,
    @SerializedName("view")
    val view: String,
    @SerializedName("appsChecker")
    val appsChecker: String,
)

