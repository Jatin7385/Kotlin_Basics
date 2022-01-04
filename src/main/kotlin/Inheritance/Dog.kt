package Inheritance
//We will be inheriting the Animals Class here using the format
class Dog : Animals("Dog"){
    init {
        legCount = 4
        println("Latest Leg Count : $legCount")
    }

    override fun makeSound() {
        println("Wooff!!")
    }
}