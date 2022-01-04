fun main(){
    val x = 3
    //Kinda like If conditions. Used when we are using only one variable for the checking.
    when(x)
    {
        in 1..2 -> println("x is between 1 and 2")
        in 3..10 -> println("x is between 3 and 10")
        else -> {println("x is not in the range 1 and 10")}
    }
}