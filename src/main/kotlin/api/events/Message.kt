package api.events

import api.Events
import api.VkApi
import kotlinx.serialization.json.decodeFromJsonElement
import models.events.Message
import models.events.MessageNew
import models.events.MessageTypingState

fun VkApi.onMessage(block: MessageNew.() -> Unit) {
   onEvent(Events.messageNew) {
        block(jsonSetting.decodeFromJsonElement<Message<MessageNew>>(it).message)
   }
}

fun VkApi.onMessageTyping(block: MessageTypingState.() -> Unit) {
    onEvent(Events.messageTypingState) {
        block(jsonSetting.decodeFromJsonElement<MessageTypingState>(it))
    }
}