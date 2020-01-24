package com.arunkumar.simpleweatherapp.jsonadapters

import com.google.gson.JsonDeserializationContext
import com.google.gson.JsonDeserializer
import com.google.gson.JsonElement
import org.threeten.bp.LocalDateTime
import java.lang.reflect.Type

class StringToLocalDateTime : JsonDeserializer<LocalDateTime> {
    override fun deserialize(json: JsonElement?, typeOfT: Type?, context: JsonDeserializationContext?): LocalDateTime {
        return json?.let {
            LocalDateTime.parse(it.asString)
        } ?: run {
            LocalDateTime.now()
        }
    }

}