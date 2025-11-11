package org.example.lesson2

const val MINUTE_PER_HOUR = 60

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457
    val departureAllInMinute : Int = departureHour * MINUTE_PER_HOUR + departureMinute
    var arrivalHour: Int = (departureAllInMinute + travelTime) / MINUTE_PER_HOUR
    var arrivalMinute: Int = (departureAllInMinute + travelTime) % MINUTE_PER_HOUR

    println("Время прибытия поезда : %02d:%02d".format(arrivalHour, arrivalMinute))

}