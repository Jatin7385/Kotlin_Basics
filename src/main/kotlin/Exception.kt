fun main()
{
    var number = readLine() ?: "0"
    println(
        try {
        number.toInt()
    }catch (e: Exception)
    {
        println("Error : The input must be an integer")
    }
    )
}