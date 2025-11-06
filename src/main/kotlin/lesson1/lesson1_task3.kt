package org.example.lesson1

fun main() {

    val year: Int = 1961
    var hour: String = "09"
    var minute: String = "07"

    println("Год полета: $year")
    println("Час вылета: $hour")
    println("Минута вылета: $minute")

    hour = "10"
    minute = "55"

    print("Посадка: $hour:$minute")
}