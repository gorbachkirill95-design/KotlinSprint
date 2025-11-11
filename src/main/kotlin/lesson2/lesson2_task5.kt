package org.example.lesson2

fun main() {

    val money: Double = 70_000.0
    val rate: Double = 16.7 / 100
    val years: Int = 20
    var finalMoney: Double = money

    for (i in 1..years) {
        finalMoney += finalMoney * rate
    }

//    val finalMoney = money * Math.pow(1 + rate, years.toDouble())
//    Нагуглил еще такой вариант
//    Не совсем понял с формулой, еще не понял как работает Math.pow, попробовал-сработало, но изначально сделал через цикл

    println("%.3f".format(finalMoney))
}