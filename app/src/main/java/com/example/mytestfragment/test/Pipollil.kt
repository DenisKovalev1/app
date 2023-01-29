package com.example.mytestfragment.test

class Pipollil (val name: String) {
    override fun toString(): String {
        val parts = "Name: $name"

        return parts

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Pipollil

        if (name != other.name) return false

        return true
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }


}