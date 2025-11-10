package org.example.lesson3

fun main() {
    var lastName: String = "Андреева"
    var firstName: String = "Татьяна"
    var patronymic: String = "Сергеевна"
    var age: Int = 20

    println("ФИО: $lastName $firstName $patronymic, Возраст: $age")
    lastName = "Сидорова"
    age = 22
    println("ФИО: $lastName $firstName $patronymic, Возраст: $age")
}