package com.arunkumar.simpleweatherapp.domainmodel

import java.time.LocalDateTime

data class WeatherInfo(val city: String, val date: LocalDateTime, val prediction: List<Prediction>)