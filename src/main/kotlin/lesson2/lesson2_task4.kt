package org.example.lesson2

fun main() {
    val crystalOre: Int = 7
    val ferrumOre: Int = 11
    val buffPercent: Int = 20

    val crystalBonus: Int = (crystalOre * buffPercent) / 100
    val ferrumBonus: Int = (ferrumOre * buffPercent) / 100

    println("Кристалическая руда под баффом: $crystalBonus")
    println("Железная руда под баффом: $ferrumBonus")

}