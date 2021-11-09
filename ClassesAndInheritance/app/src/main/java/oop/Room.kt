package oop

open class Room(area: Double) {
     val area: Double = area


    open protected val title: String = "Обычная комната"
    fun getDescription() {
        println(title)
        println("Площадь $area")

    }
}



