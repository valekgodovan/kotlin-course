package org.valek.kotlincourse.lesson6

fun main() {
    val month = 5
    val season = getSeason(month)
    println("Month $month is in $season")
}

fun getSeason(monthNumber: Int?): String {
    return when (monthNumber) {
        1, 2, 12 -> "Winter"
        3, 4, 5 -> "Spring"
        6, 7, 8 -> "Summer"
        9, 10, 11 -> "Autumn"
        else -> "Month number must be between 1 and 12"
    }
}