package http

import kotlinx.serialization.json.Json
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import java.lang.StringBuilder
import java.util.concurrent.TimeUnit

class HttpClient(
    private val wait: Long,
    val json: Json
) {
    private val httpClient = OkHttpClient().newBuilder()
        .connectTimeout(wait + 10, TimeUnit.SECONDS)
        .readTimeout(wait + 10, TimeUnit.SECONDS)
        .writeTimeout(wait + 10, TimeUnit.SECONDS)
        .build()

    fun get(url: String, vararg params: Pair<String, *>): String {
        val urlBuild = StringBuilder().apply {
            append("$url?")
            params.forEachIndexed { index, pair ->
                if (index != 0) append("&")
                append(pair.first + "=" + pair.second)
            }
        }
        val req = Request.Builder().url(urlBuild.toString()).get().build()
        return httpClient.newCall(req).execute().body!!.string()
    }

    inline fun <reified T> get(url: String, vararg params: Pair<String, *>): T {
        val data = get(url = url, params = params)
        return json.decodeFromString<T>(data)
    }

    fun call(url: String, params: ArrayList<Pair<String, *>>): String {
        val urlBuild = StringBuilder().apply {
            append("$url?")
            params.forEachIndexed { index, pair ->
                if (index != 0) append("&")
                append(pair.first + "=" + pair.second)
            }
        }
        val req = Request.Builder().url(urlBuild.toString()).build()
        return httpClient.newCall(req).execute().body!!.string()
    }
}
