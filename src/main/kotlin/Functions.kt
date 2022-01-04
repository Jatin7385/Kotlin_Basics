fun main()
{
    print10Numbers(5)
    val res = isEven(24)
    println(res)
    val x = 3
    println(x.isOdd())
}

fun print10Numbers(x : Int)
{
    for(i in 1..x)
    {
        println(i)
    }
}

//We can also pass default parameters by mentioning number: Int = value
//To pass parameters to the function, we write the variable type with a :
//Then outside the bracket we mention the return variable type after a :
fun isEven(number: Int): Boolean
{
    return number % 2 == 0
}

// Rather than passing the variable, we can call the function on the variable
fun Int.isOdd(): Boolean
{
    return this%2 == 1
}