package models.events

import api.VkApi
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonObject

@Serializable
data class MessageNew(
    val id: Int,
    val date: Int,
    @SerialName("peer_id")
    val peerId: Int,
    @SerialName("from_id")
    val fromId: Int,
    val text: String? = null,
    @SerialName("random_id")
    val randomId: Int? = null,
    val ref: String? = null,
    @SerialName("ref_source")
    val refSource: String? = null,
    val attachments: JsonArray? = null,
    val important: Boolean? = null,
    val geo: JsonObject? = null,
    val payload: String? = null,
    val keyboard: JsonObject? = null,
    @SerialName("fwd_messages")
    val fwdMessages: JsonArray? = null,
    @SerialName("reply_message")
    val replyMessage: JsonObject? = null,
    val action: JsonObject? = null,
    @SerialName("admin_author_id")
    val adminAuthorId: Int? = null,
    @SerialName("conversation_message_id")
    val conversationMessageId: Int? = null,
    @SerialName("is_cropped")
    val isCropped: Boolean? = null,
    @SerialName("members_count")
    val membersCount: Int? = null,
    @SerialName("update_time")
    val updateTime: Int? = null,
    @SerialName("was_listened")
    val wasListened: Boolean? = null,
    @SerialName("pinned_at")
    val pinnedAt: Int? = null,
    @SerialName("message_tag")
    val messageTag: String? = null,
    @SerialName("is_mentioned_user")
    val isMentionedUser: Boolean? = null
)
