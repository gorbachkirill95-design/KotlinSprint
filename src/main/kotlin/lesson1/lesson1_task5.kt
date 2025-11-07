package org.example.lesson1

const val secondPerMinute = 60
const val secondPerHour = 3600

fun main() {

    val allSeconds: Int = 6480
    val hours: Int = allSeconds / secondPerHour
    val minutes: Int = (allSeconds % secondPerHour) / secondPerMinute
    val seconds: Int = allSeconds % secondPerMinute

    println("Общее время в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))

}