fun main()
{
    val number1 = readLine() //ReadLine accepts string variable
    val number2 = readLine()
    val result = number1!!.toInt() + number2!!.toInt()
    //!! in between, tells kotlin to assume the numbers as not null
    println(result)
    //But the !! can cause the program to crash incase the numbers are null, so we assign default values to our inputs
    val num1 = readLine() ?: "0"
    val num2 = readLine() ?: "0"
    val res = num1.toInt() + num2.toInt()
    println(res)
}