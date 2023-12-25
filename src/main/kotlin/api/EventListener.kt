package api

import kotlinx.serialization.json.JsonObject

open class EventListener() {
    private val eventListeners = ArrayList<Pair<String, (JsonObject) -> Unit>>()

    fun newEventListener(type: String, block: (JsonObject) -> Unit) {
        eventListeners += Pair(type, block)
    }

    fun searchEventListener(type: String, event: JsonObject) {
        eventListeners.forEach {
            if (it.first == type) return@forEach it.second(event)
        }
    }
}