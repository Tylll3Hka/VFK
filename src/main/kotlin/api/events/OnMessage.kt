package api.events

import api.Events
import api.VkApi
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import models.events.Message
import models.events.MessageNew

fun VkApi.onMessage(block: MessageNew.() -> Unit) {
    eventListener.newEventListener(Events.messageNew) {
        block(jsonSetting.decodeFromJsonElement<Message<MessageNew>>(it).message)
    }
}