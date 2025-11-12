package org.example.lesson5

fun main() {
    val firstNumber = 25
    val secondNumber = 12

    print("Привет! Давай сыграем в игру! Нужно угадать два числа от 0 до 42, введи первое число: ")
    val userFirstNumber = readln().toInt()

    println()

    print("Отлично! давай теперь второе число от 0 до 42: ")
    val userSecondNumber = readln().toInt()

    val allWin = (firstNumber == userFirstNumber && secondNumber == userSecondNumber) ||
            (firstNumber == userSecondNumber && secondNumber == userFirstNumber)
    val consolationPrize = (firstNumber == userFirstNumber || firstNumber == userSecondNumber) ||
            (secondNumber == userSecondNumber || secondNumber == userFirstNumber)
    Thread.sleep(1000)

    when {
        allWin -> println("Поздравляем! Вы выиграли главный приз!")
        consolationPrize -> println("Вы выиграли утешительный приз")
        else -> println("Неудача!")
    }

    println("Правильные числа: $firstNumber, $secondNumber")
}
