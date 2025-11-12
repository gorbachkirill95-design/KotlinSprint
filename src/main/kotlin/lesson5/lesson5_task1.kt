package org.example.lesson5

fun main() {
    val captcha = "25 + 30 = "
    val answer = "55"

    print("Докажите, что вы не робот: $captcha")

    val userAnswer = readln()

    if (userAnswer == answer) {
        println("Добро пожаловать!")
    } else
        println("Доступ запрещен.")

}