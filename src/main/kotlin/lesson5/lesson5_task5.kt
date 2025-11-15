package org.example.lesson5

fun main() {
    val numbers = Array(2) { (0..42).random().toString() }
    val userNumbers = Array(2) { "" }
//    println(numbers.joinToString(", ")) для теста

    print("Привет! Давай сыграем в игру! Нужно угадать два числа от 0 до 42, введи первое число: ")
    userNumbers[0] = readln()

    println()

    print("Отлично! давай теперь второе число от 0 до 42: ")
    userNumbers[1] = readln()

    val intersection = numbers.intersect(userNumbers.toSet())
    Thread.sleep(1000)

    when (intersection.size) {
        2 -> println("Поздравляем! Вы выиграли главный приз!")
        1 -> println("Вы выиграли утешительный приз")
        else -> println("Неудача!")
    }

    println("Правильные числа: ${numbers.joinToString(", ")}")
}