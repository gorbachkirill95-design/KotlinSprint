package org.example

fun main() {
    print("Есть ли повреждения корпуса (true/false)? ")
    val damage = readLine()!!.toBoolean()

    print("Количество членов экипажа: ")
    val crew = readLine()!!.toInt()

    print("Количество ящиков провизии: ")
    val provisions = readLine()!!.toInt()

    print("Погода благоприятна (true/false)? ")
    val goodWeather = readLine()!!.toBoolean()

    val departure =
        (!damage && crew in 55..70 && provisions > 50) || (damage && crew == 70 && goodWeather && provisions >= 50)

    println("Корабль может отправиться в плавание: $departure")
}