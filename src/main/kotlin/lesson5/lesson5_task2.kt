package org.example.lesson5

const val AGE_OF_MAJORITY = 18
const val YEAR = 2025
fun main() {

    print("Введите год вашего рождения: ")

    val userAge = readln().toInt()

    if (YEAR - userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else
        println("Вернуться на начальный экран")

}