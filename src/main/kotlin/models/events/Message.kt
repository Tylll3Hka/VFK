package models.events

import kotlinx.serialization.Serializable

@Serializable
data class Message<T>(
    val message: T
)
