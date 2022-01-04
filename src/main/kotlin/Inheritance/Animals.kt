package Inheritance

//Since we don't want an Instance of the animals class to be created directly, but through its child classes, we change it to Abstract
abstract class Animals(
    val name: String,
    var legCount: Int = 0
){
    init {
        println("Hello, I am a $name")
        println("Initial LegCount : $legCount")
    }

    abstract fun makeSound()
    //Now we have created an abstract function in the parent class.
    //We will have to override this function in the child classes to make the sound
}