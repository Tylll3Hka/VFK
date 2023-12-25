package api

import http.HttpClient
import kotlinx.serialization.json.Json
import models.LongPollServer
import models.Response
import models.Update
import sun.java2d.pipe.hw.ExtendedBufferCapabilities.VSyncType

class VkApi(
    private val token: String,
    private val groupId: Int,
    private val wait: Long = 90
) {
    val jsonSetting = Json {
        ignoreUnknownKeys = true
    }
    private val baseUrl = "https://api.vk.com/method"
    private val httpClient = HttpClient(wait, jsonSetting)
    val eventListener = EventListener()

    fun call(method: String, vararg params: Pair<String, *>): String {
        return httpClient.call("$baseUrl/$method", params = params)
    }

    fun startLongPolling() {
        val data = getLongPollServer()
        processPolling(data) {
            if (updates.isNotEmpty()) {
                updates.forEach {
                    eventListener.searchEventListener(it.type, it.`object`)
                }
            }
        }
    }

    private fun getLongPollServer(): LongPollServer {
        return httpClient.get<Response<LongPollServer>>(
            url = "$baseUrl/groups.getLongPollServer",
            params = arrayOf(
                "access_token" to token,
                "v" to 5.199f,
                "group_id" to groupId
            )
        ).response
    }

    private inline fun processPolling(
        data: LongPollServer,
        block: Update.() -> Unit
    ) {
        var ts = data.ts
        while (true) {
            val event = httpClient.get<Update>(
                url = data.server,
                params = arrayOf(
                    "act" to "a_check",
                    "key" to data.key,
                    "ts" to ts,
                    "wait" to wait,
                    "mode" to 2,
                    "version" to 2
                )
            )
            ts = event.ts
            block(event)
        }
    }
}