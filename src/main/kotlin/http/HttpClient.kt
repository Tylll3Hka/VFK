package http

import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import utils.Parameters
import java.lang.StringBuilder
import java.util.concurrent.TimeUnit

class HttpClient(
    wait: Long,
    val json: Json
) {
    private val httpClient = OkHttpClient().newBuilder()
        .connectTimeout(wait + 10, TimeUnit.SECONDS)
        .readTimeout(wait + 10, TimeUnit.SECONDS)
        .writeTimeout(wait + 10, TimeUnit.SECONDS)
        .build()

    fun get(url: String, params: Parameters): String {
        val req = Request.Builder().url("$url/$params").get().build()
        return httpClient.newCall(req).execute().body!!.string()
    }

    inline fun <reified T> get(url: String, params: Parameters): T =
        json.decodeFromString<T>(get(url, params))

    fun call(url: String, params: Parameters): String {
        val req = Request.Builder().url("$url/$params").build()
        return httpClient.newCall(req).execute().body!!.string()
    }
}
