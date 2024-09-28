package org.valek.kotlincourse.lesson6


fun main() {
    println(getSeason(4))
    println(dogToHumanYears(1.5))
    println(chooseTransport(2.3))
    println(countBonus(555.00))
    println(recommendLook(15))
    println(getFilmCategories(7))

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

fun dogToHumanYears(dogAge: Double): Double {
    return if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }
}


fun chooseTransport(distance: Double): String {
    return when {
        distance in 0.0..1.0 -> "пешком"
        distance in 1.0..5.0 -> "велосипед"
        else -> "автотранспорт"
    }
}


fun countBonus(purchaseAmount: Double): Int {
    return if (purchaseAmount <= 1000) {
        (purchaseAmount / 100 * 2).toInt()
    } else {
        (purchaseAmount / 100 * 5).toInt()
    }
}

//7
fun recommendLook(temperature: Int): String {
    return when {
        temperature < -30 -> "Не выходите из дома"
        temperature in -30..0 -> "Куртка и шапка"
        temperature in 1..15 -> "Ветровка"
        temperature in 16..35 -> "Футболка и шорты"
        else -> "Не выходите из дома"
    }
}

//8
fun getFilmCategories(age: Int): String {
    return when {
        age < 13 -> "Доступные категории: детские"
        age in 13..17 -> "Доступные категории: детские, подростковые"
        else -> "Доступные категории: детские, подростковые, 18+"
    }
}