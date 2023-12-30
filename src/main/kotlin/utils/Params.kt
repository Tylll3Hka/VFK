package utils

import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive

class Parameters() {
    private val map = mutableMapOf<String, MutableCollection<Any?>>()

    constructor(from: Map<String, *>): this() {
        map.putAll(mutableMapOf<String, MutableCollection<Any?>>().also {
            from.forEach { (k, v) ->
                if (v is Collection<*>) it[k] = v.toMutableList()
                else it[k] = mutableListOf(v ?: "")
            }
        })
    }

    private fun buildQuery(): String = StringBuilder().apply {
        map.entries.forEachIndexed { i, (k, v) ->
            append(k)
            buildValue(v).also {
                if (it.isNotEmpty()) append('=').append(it)
            }
            if (i < map.entries.size - 1) append('&')
        }
    }.toString()


    override fun toString(): String = buildQuery()

    fun buildJsonString(): String = JsonObject(
        map.mapValues {
            JsonPrimitive(buildValue(it.value))
        }
    ).toString()

    private fun buildValue(v: Collection<Any?>): String =
        v.map { it?.toString().orEmpty() }
            .filter { it.isNotEmpty() }
            .joinToString(",")


    fun put(key: String, value: Any?) {
        map[key] = (map[key] ?: mutableListOf()).also {
            if (value is Collection<*>)
                if (value.isEmpty()) it.add("") else it.addAll(value)
            else it.add(value ?: "")
        }
    }

    fun putAll(other: Parameters) {
        other.map.forEach { (k, v) ->
            map[k] = (map[k] ?: mutableListOf()).also {
                it.addAll(v)
            }
        }
    }

    companion object {
        fun of(vararg arr: String): Parameters = Parameters().apply {
            val pairs = arr.toList().chunked(2)

            pairs.forEachIndexed { index, list ->
                if (index == pairs.lastIndex) {
                    if (list.size == 1) put(list[0], "")
                    else put(list[0], list[1])
                } else put(list[0], list[1])
            }
        }

        fun of(vararg pairs: Pair<String, Any?>): Parameters =
            Parameters().apply {
                pairs.forEach {
                    put(it.first, it.second)
                }
            }

        fun of(map: Map<String, Any?>): Parameters = Parameters(map)
    }
}

fun paramsOf(vararg arr: String): Parameters = Parameters.of(*arr)

fun paramsOf(vararg pairs: Pair<String, Any?>): Parameters = Parameters.of(*pairs)

fun paramsOf(map: Map<String, Any?>): Parameters = Parameters.of(map)