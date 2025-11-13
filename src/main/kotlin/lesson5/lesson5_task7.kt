package org.example.lesson5

fun main() {
    println("Давай посчитаем сколько мы потратим топлива!")
    Thread.sleep(1000)

    print("Введи расстояние поездки(в километрах): ")
    val distance: Double = readln().toDouble()

    print("Введи расход топлива на 100км(в литрах): ")
    val consumption: Double = readln().toDouble()

    print("Введи текущую цену за литр топлива: ")
    val fuelCost: Double = readln().toDouble()

    val fuel = (distance * consumption) / 100
    val allPrice = fuel * fuelCost

    println(
        """
        Общее количество топлива потребуется: %.2f литров
        Итоговая стоимость поездки обойдется в: %.2f рублей
        """.trimIndent().format(fuel, allPrice)
    )
}