package org.example.lesson4

fun main() {
    val day: Int = 5
    val evenDay: Boolean = day % 2 == 0

    println(
        """
        Упражнения для рук:     ${!evenDay}
        Упражнения для ног:     $evenDay
        Упражнения для спины:   $evenDay
        Упражнения для пресса:  ${!evenDay}
    """.trimIndent()
    )
}