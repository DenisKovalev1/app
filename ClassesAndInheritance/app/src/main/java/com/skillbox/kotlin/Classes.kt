package com.skillbox.kotlin

import oop.*


fun main() {
    val apartment = Room(33.3)
    apartment.getDescription()
    val room1 = Bedroom(22.2)
    room1.getDescription()
    val room2 = ChildrensRoom(44.4)
    room2.getDescription()
    val room3 = LivingRoom(55.5)
    room3.getDescription()
    val room4 = Kitchen(11.1)
    room4.getDescription()
    val room5 = Bathroom(21.1)
    room5.getDescription()
    val room6 = FreeRoom("Комната свободного назначения",88.1)
    room6.getDescription()
}
