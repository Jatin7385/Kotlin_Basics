fun main()
{
    val list = listOf("Kotlin","is","fun")
    //The code below is a lambda function
    val count = list.count { currentString -> currentString.length == 3
    }
    println(count)

    val count1 = list.customCount { currentString -> currentString.length > 2 }
    println(count1)
}

//Creating our own custom function that extends the Lists current Functions
//Also, instead of stating String everywhere, we could replace it with T, which allows us to use any Datatype
fun List<String>.customCount(function: (String) -> Boolean): Int
{
    var counter = 0
    for(string in this)
    {
        if(function(string))
        {
            counter++
        }
    }
    return counter
}