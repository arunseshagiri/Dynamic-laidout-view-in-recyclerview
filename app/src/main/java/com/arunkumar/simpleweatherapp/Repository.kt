package com.arunkumar.simpleweatherapp

import com.arunkumar.simpleweatherapp.api.RetrofitBuilder
import com.arunkumar.simpleweatherapp.domainmodel.Prediction
import com.arunkumar.simpleweatherapp.domainmodel.WeatherInfo
import com.arunkumar.simpleweatherapp.dtomodel.WeatherInfoRaw
import io.reactivex.Single

class Repository(private val retrofitBuilder: RetrofitBuilder) {

    fun weatherInfo(): Single<WeatherInfo> = retrofitBuilder.getApi().getWeatherInfo().map { mapper.invoke(it) }
}

val mapper: (WeatherInfoRaw) -> WeatherInfo = {
    val prediction = mutableListOf<Prediction>()
    it.prediction.forEach { predictionRaw ->
        prediction.add(
            Prediction(predictionRaw.date, predictionRaw.tempInC, "${predictionRaw.windSpeed} ${predictionRaw.windSpeedUnit}", predictionRaw.time)
        )
    }
    WeatherInfo(
        it.city, it.date, prediction
    )
}