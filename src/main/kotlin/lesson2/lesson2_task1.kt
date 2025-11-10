package org.example.lesson2

fun main() {
    val studend1: Int = 3
    val studend2: Int = 4
    val studend3: Int = 3
    val studend4: Int = 5

    var arMeanString: String = String.format("%.2f", ((studend1 + studend2 + studend3 + studend4) / 4).toDouble())

    println("Среднее арифметическое класса: $arMeanString")
}