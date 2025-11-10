package org.example.lesson1

const val SECOND_PER_MINUTE = 60
const val SECOND_PER_HOUR = 3600

fun main() {

    val allSeconds: Int = 6480
    val hours: Int = allSeconds / SECOND_PER_HOUR
    val minutes: Int = (allSeconds % SECOND_PER_HOUR) / SECOND_PER_MINUTE
    val seconds: Int = allSeconds % SECOND_PER_MINUTE

    println("Общее время в космосе: %02d:%02d:%02d".format(hours, minutes, seconds))

}