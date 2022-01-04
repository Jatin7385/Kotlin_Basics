import Inheritance.Animals

fun main()
{
    //When we need temporary classes that are only used in the particular function and nowhere else, we use Anonymous Classes
    val bear = object  : Animals("Bear"){
        init {
            legCount = 4
            println("Current LegCount : $legCount")
        }
        override fun makeSound() {
            println("Rooarr!!")
        }
    }
    bear.makeSound()
}