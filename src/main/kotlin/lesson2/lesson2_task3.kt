package org.example.lesson2

const val minutePerHour = 60

fun main() {
    val departureHour: Int = 9
    val departureMinute: Int = 39
    val travelTime: Int = 457
    var arrivalHour: Int                 //могу ли я сразу здесь делать расчеты или это считается плохим тоном?
    var arrivalMinute: Int
    //или можно сделать отступ после travelTime и сразу проинициализировать их здесь и сразу же провести в них расчеты?
    arrivalHour = ((departureHour * minutePerHour + departureMinute) + travelTime) / minutePerHour
    arrivalMinute = ((departureHour * minutePerHour + departureMinute) + travelTime) % minutePerHour


    println("Время прибытия поезда : %02d:%02d".format(arrivalHour, arrivalMinute))

}