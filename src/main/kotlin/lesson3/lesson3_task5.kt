package org.example.lesson3

fun main() {
    val moveString: String = "D2-D4;0"
    val from: String = moveString[0] + moveString[1].toString()
    val to: String = moveString[3] + moveString[4].toString()
    val numberMove = moveString[6].digitToInt()

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $numberMove")
}
