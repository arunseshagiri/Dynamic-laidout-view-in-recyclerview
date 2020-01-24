package com.arunkumar.simpleweatherapp.domainmodel

import java.time.LocalDateTime

data class Prediction(
    val date: LocalDateTime,
    val tempInC: Float,
    val windSpeed: String,
    val time: LocalDateTime
)