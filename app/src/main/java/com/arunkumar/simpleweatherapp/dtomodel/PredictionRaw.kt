package com.arunkumar.simpleweatherapp.dtomodel

import com.arunkumar.simpleweatherapp.jsonadapters.StringToLocalDateTime
import com.google.gson.annotations.JsonAdapter
import java.time.LocalDateTime

data class PredictionRaw(
    @JsonAdapter(StringToLocalDateTime::class) val date: LocalDateTime,
    val tempInC: Float,
    val windSpeed: Int,
    val windSpeedUnit: String,
    @JsonAdapter(StringToLocalDateTime::class) val time: LocalDateTime
)