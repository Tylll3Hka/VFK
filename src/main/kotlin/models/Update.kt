package models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonObject

@Serializable
data class Update(
    val ts: Int,
    val updates: List<UpdateList>
)

@Serializable
data class UpdateList(
    @SerialName("group_id")
    val groupId: Int,
    val type: String,
    @SerialName("event_id")
    val eventId: String,
    val v: Float,
    val `object`: JsonObject
)
