package org.example.lesson3

fun main() {
    val moveString = "D2-D4;0"
    val parts: List<String> = moveString.split(";")
    val moves: List<String> = parts[0].split("-")
    val from = moves[0]
    val to = moves[1]
    val moveNumber = parts[1].toInt()
//изначально я и делал через сплит, но потом подумал что коллекции мы еще не проходили и надо бы сделать по чарам строки :-D
    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")

}
