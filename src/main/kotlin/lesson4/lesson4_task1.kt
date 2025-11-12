package org.example.lesson4

fun main() {
    val tables = 13
    val today = 13
    val tomorrow = 9
    val reservToDay = tables > today
    val reservTomorrow = tables > tomorrow

    println("Доступность столиков на сегодня: $reservToDay\nДоступность столиков на завтра: $reservTomorrow")

}