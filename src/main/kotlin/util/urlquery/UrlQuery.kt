package util.urlquery

import java.net.URLEncoder

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class QEntry(val url: String)

@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class QField(val name: String = "")

class ToUrlException(message: String) : Exception(message)

fun toUrlParams(obj: Any): String = StringBuilder()
    .apply {
        val entry = obj.javaClass
        val entryAnnotation = entry.getAnnotation(QEntry::class.java) ?: throw ToUrlException("No QEntry annotation")
        append(entryAnnotation.url)
        entry.declaredFields
            .filter { it.getAnnotation(QField::class.java) != null }
            .forEachIndexed { i, v ->
                val fieldA = v.getAnnotation(QField::class.java) ?: return@forEachIndexed
                val name =
                    if (fieldA.name == "")
                        v.name.map {
                            if (it.isUpperCase()) "_${it.lowercaseChar()}"
                            else it.toString()
                        }.reduce { a, b -> a + b }
                    else
                        fieldA.name
                append(if (i == 0) '?' else '&')
                append(name)
                append('=')
                val canAccess = v.canAccess(obj)
                if (!canAccess) v.isAccessible = true
                append(URLEncoder.encode(v.get(obj).toString(), Charsets.UTF_8))
                if (!canAccess) v.isAccessible = false
            }
    }
    .toString()
