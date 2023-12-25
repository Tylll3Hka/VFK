package models

import kotlinx.serialization.Serializable

@Serializable
data class LongPollServer(
    val key: String,
    val server: String,
    val ts: Int
)
