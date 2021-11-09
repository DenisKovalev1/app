package com.skillbox.basemethods.oop

 class  Person(var height: Int, var weight: Int, var name: String ) {

val animalName = listOf<String>(
    "Шарик","Кузя","Барсик","Лаки","Барбос","Маркиз","Шмыг","Эй ты а ну иди сюда","Джери"
)
    val pets = hashSetOf<Animal>()
fun buyPet() {
    val animal = Animal((0..20).random(),(0..40).random(),animalName.random())
    pets.add(animal)
}

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Person

        if (height != other.height) return false
        if (weight != other.weight) return false
        if (name != other.name) return false
        if (pets != other.pets) return false

        return true
    }

    override fun hashCode(): Int {
        var result = height
        result = 31 * result + weight
        result = 31 * result + name.hashCode()
        result = 31 * result + pets.hashCode()
        return result
    }

    override fun toString(): String {
        return "Человек Имя=$name, Рост=$height, Вес=$weight,  Животное=$pets"
    }

}