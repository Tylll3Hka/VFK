package models

import kotlinx.serialization.Serializable

@Serializable
data class Response<T>(val response: T)
