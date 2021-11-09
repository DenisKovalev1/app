package com.skillbox.basemethods.oop

data class Animal (val energy: Int, val weight: Int, val name: String) {
    override fun toString(): String {
        return " Кличка=$name, Энергия=$energy, Вес=$weight"
    }
}