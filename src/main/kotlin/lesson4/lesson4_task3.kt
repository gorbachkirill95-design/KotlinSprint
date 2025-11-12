package org.example.lesson4

const val SUNNY_WEATHER: Boolean = true
const val OPEN_AWNING: Boolean = true
const val HUMIDITY: Int = 20
const val BAD_SEASON: String = "Зима"

fun main() {
    val sunny: Boolean = true
    val openTilt: Boolean = true
    val wet: Int = 20
    val season: String = "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${SUNNY_WEATHER == sunny && OPEN_AWNING == openTilt && HUMIDITY == wet && BAD_SEASON != season}")

}