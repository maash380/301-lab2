package com.example.listycity

class CityRepository {
    private val _cities = mutableListOf(
        "Edmonton", "Vancouver", "Moscow",
        "Sydney", "Berlin", "Vienna",
        "Tokyo", "Beijing", "Osaka",
        "New Delhi"
    )
    val cities: List<String>
        get() = _cities

    fun addCity(city: String){
        _cities.add(city)
    }
    fun deleteCity(city: String) {
        _cities.remove(city)
    }
}