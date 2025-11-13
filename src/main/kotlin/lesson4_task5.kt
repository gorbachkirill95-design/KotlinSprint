package org.example

const val MIN_COUNT_CREW = 55
const val MAX_COUNT_CREW = 70
const val MIN_COUNT_PROVISION = 50
const val NO_DAMAGE = false
const val HAS_DAMAGE = true
const val GOOD_WEATHER = true

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
        (damage == NO_DAMAGE && crew in MIN_COUNT_CREW..MAX_COUNT_CREW && provisions > MIN_COUNT_PROVISION) ||
                (damage == HAS_DAMAGE && crew == MAX_COUNT_CREW && goodWeather==GOOD_WEATHER && provisions >= MIN_COUNT_PROVISION)

    println("Корабль может отправиться в плавание: $departure")
}