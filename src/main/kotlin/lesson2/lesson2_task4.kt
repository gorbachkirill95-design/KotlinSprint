package org.example.lesson2

fun main() {
    val crystalOre: Int = 7
    val ferrumOre: Int = 11
    val buffPercent: Double = 0.2

    val crystalBonus: Int = (crystalOre * buffPercent).toInt()
    val ferrumBonus: Int = (ferrumOre * buffPercent).toInt()

    println("Кристалическая руда под баффом: $crystalBonus")
    println("Железная руда под баффом: $ferrumBonus")

}