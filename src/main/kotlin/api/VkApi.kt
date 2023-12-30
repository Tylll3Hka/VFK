package api

import http.HttpClient
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import models.LongPollServer
import models.Response
import models.Update
import models.events.MessageNew
import utils.Parameters
import utils.paramsOf

class VkApi(
    private val token: String,
    private val groupId: Int,
    private val wait: Long = 90
) {
    val jsonSetting = Json { ignoreUnknownKeys = true }
    private val baseUrl = "https://api.vk.com/method"
    private val eventListener = EventListener()
    private val httpClient = HttpClient(wait, jsonSetting)

    fun call(method: String, params: Parameters): String {
        params.put("access_token", token)
        params.put("group_id", groupId)
        return httpClient.call("$baseUrl/$method", params)
    }


    fun onEvent(eventType: String, block: (JsonObject) -> Unit) {
        eventListener.newEventListener(eventType) {
            block(it)
        }
    }

    fun startLongPolling() {
        val data = getLongPollServer()
        processPolling(data) {
            if (updates.isNotEmpty()) updates.forEach {
                eventListener.searchEventListener(it.type, it.`object`)
            }
        }
    }

    private fun getLongPollServer(): LongPollServer = httpClient
        .get<Response<LongPollServer>>(
            url = "$baseUrl/groups.getLongPollServer",
            params = paramsOf(
                "access_token" to token,
                "v" to 5.199f,
                "group_id" to groupId
            )
        ).response


    private inline fun processPolling(
        data: LongPollServer,
        block: Update.() -> Unit
    ) {
        var ts = data.ts
        while (true) {
            val event = httpClient.get<Update>(
                url = data.server,
                params = paramsOf(
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