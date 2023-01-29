package com.example.mytestfragment.test

data class Pepl (val name: String, val age: Int, val cantri: String)

{
    override fun toString(): String {
        val name = "Name: $name Возрост: $age Город: $cantri"
        return name
    }
}