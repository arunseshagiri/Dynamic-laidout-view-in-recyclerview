package com.arunkumar.simpleweatherapp.api

import com.arunkumar.simpleweatherapp.dtomodel.WeatherInfoRaw
import io.reactivex.Single
import retrofit2.http.GET

interface WeatherInfoApi {

    @GET("weatherinfo.json")
    fun getWeatherInfo(): Single<WeatherInfoRaw>
}