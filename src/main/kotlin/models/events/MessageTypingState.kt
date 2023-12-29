package models.events

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MessageTypingState(
    val state: String,
    @SerialName("from_id")
    val fromId: Int,
    @SerialName("to_id")
    val toId: Int,
)
