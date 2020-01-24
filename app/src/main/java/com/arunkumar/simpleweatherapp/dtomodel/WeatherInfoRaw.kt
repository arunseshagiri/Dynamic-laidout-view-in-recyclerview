package com.arunkumar.simpleweatherapp.dtomodel

import com.arunkumar.simpleweatherapp.jsonadapters.StringToLocalDateTime
import com.google.gson.annotations.JsonAdapter
import java.time.LocalDateTime

data class WeatherInfoRaw(val city: String, @JsonAdapter(StringToLocalDateTime::class) val date: LocalDateTime, val prediction: List<PredictionRaw>)