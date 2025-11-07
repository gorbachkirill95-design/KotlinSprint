package org.example.lesson2

fun main() {
    val countOldEmployees: Int = 50
    val countNewEmployees: Int = 30
    val salaryOldEmployees: Int = 30000
    val salaryNewEmployees: Int = 20000
    var sumSalaryOldEmployees: Int
    var sumSalaryAll: Int
    var arMeanSalaryEmployee: Int

    sumSalaryOldEmployees = countOldEmployees*salaryOldEmployees
    sumSalaryAll = sumSalaryOldEmployees+countNewEmployees*salaryNewEmployees
    arMeanSalaryEmployee = sumSalaryAll/(countNewEmployees+countOldEmployees)

    println("Расходы на выплату постоянных сотрудников: $sumSalaryOldEmployees")
    println("Расходы на выплату всех сотрудников: $sumSalaryAll")
    println("Средняя ЗП сотрудника: $arMeanSalaryEmployee")


}