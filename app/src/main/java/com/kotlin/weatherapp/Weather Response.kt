package com.kotlin.weatherapp

data class WeatherResponse(
    var coord:Coord,
    var weather: List<Weather>,
    var base:String,
    var main:Main,
    var visibility:Long,
    var dt:Long,
)

data class Coord(
    var lon:Double,
    var lat:Double
)

data class Weather(
    var id:Long,
    var main:String,
    var description:String,
    var icon:String
)

data class Main(
    var temp:Double
)
