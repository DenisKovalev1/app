package com.skillbox.basemethods

import com.skillbox.basemethods.oop.Person


fun main() {
    val human = Person (28,33,"Ivan")
    val human1 = Person (28, 33, "Ivan")
    val human2 = Person (22, 45, "Leo")
   human.buyPet()
    human2.buyPet()
    human.buyPet()
    human1.buyPet()

    val setHuman = setOf<Person>(
        human,
        human1,
        human2,
    )
setHuman.forEach{
    println(it)
}
    println("Количество итоговых элементов в сете = ${setHuman.size}")
}