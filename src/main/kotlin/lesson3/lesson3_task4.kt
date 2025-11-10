package org.example.lesson3

fun main() {
    var from: String = "E2"
    var to: String = "E4"
    var numberMove: Int = 1

    println("[$from-$to;$numberMove]")

    from = "D2"
    to = from[0] + (from[1] + 1).toString()
    numberMove = 2

    println("[$from-$to;$numberMove]")

}