package org.example.lesson4

fun main() {
    val day: Int = 5
    val armsDay: Boolean = day % 2 != 0
    val legsDay: Boolean = day % 2 == 0
    val pressDay: Boolean = armsDay
    val rearDay: Boolean = legsDay
    println(
        """
        Упражнения для рук:     $armsDay
        Упражнения для ног:     $legsDay
        Упражнения для спины:   $rearDay
        Упражнения для пресса:  $pressDay
    """.trimIndent()
    )
}