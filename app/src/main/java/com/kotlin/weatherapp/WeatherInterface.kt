package com.kotlin.weatherapp

import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherService {

    @GET("/data/2.5/weather")
    suspend fun getWeather(@Query("q") cityName:String, @Query("appid") apiKey:String):WeatherResponse
}