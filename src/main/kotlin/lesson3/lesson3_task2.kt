package org.example.lesson3

fun main() {
    var lastName: String = "Андреева"
    val firstName: String = "Татьяна"
    val patronymic: String = "Сергеевна"
    var age: Int = 20

    println("ФИО: $lastName $firstName $patronymic, Возраст: $age")
    lastName = "Сидорова"
    age = 22
    println("ФИО: $lastName $firstName $patronymic, Возраст: $age")
}