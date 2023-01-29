package com.example.mytestfragment.test

fun main() {
    val r1 = Pepl("Марина", 32, "Краснодар")
    val r2 = Pipollil("Денис")

    val mapR = mapOf("Regex" to r1, "Regex2" to r2)
    for ((key, value) in mapR) {
        println("key: $key, value: $value")
    }

    val r3 = Pipollil("Баки")
    val r4 = Pipollil("Баки")


    println(r3==r4)
    println(r3===r4)

    val r5 = Pepl("Баки",4, "Краснодар")
    val r6 = Pepl("Баки", 4, "Краснодар")
    val r7  = r5

    println(r5==r6)
    println(r5===r6)
    println(r7===r5)

    println(mapR.toList().size)
    println(mapR)

}