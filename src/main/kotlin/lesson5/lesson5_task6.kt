package org.example.lesson5

import kotlin.math.pow

fun main() {

    print("Добро пожаловать в калькулятор индекса массы тела! Введите свой вес в килограммах: ")
    val weight: Double = readln().toDouble()

    print("Отлично теперь введите свой рост в сантиметрах: ")
    val height: Double = readln().toDouble() / 100

    val imt = weight / (height.pow(2))

    val category = when {
        imt < 18.5 -> "Недостаточная масса тела"
        imt < 25 -> "Нормальная масса тела"
        imt < 30 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("Ваш ИМТ: %.2f".format(imt))
    println("Ваша категория: $category")

}