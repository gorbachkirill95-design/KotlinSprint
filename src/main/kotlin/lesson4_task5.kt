package org.example

const val MIN_COUNT_CREW = 55
const val MAX_COUNT_CREW = 70
const val MIN_COUNT_PROVISION = 50

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
        (!damage && crew in MIN_COUNT_CREW..MAX_COUNT_CREW && provisions > MIN_COUNT_PROVISION) ||
                (damage && crew == MAX_COUNT_CREW && goodWeather && provisions >= MIN_COUNT_PROVISION)

    println("Корабль может отправиться в плавание: $departure")
}