fun main()
{
    val shoppingList = mutableListOf("Apples","Oranges","Grapes","Strawberries","Blue Berries")

    //While Loop
    println("WHILE LOOP")
    var counter = 0
    while(counter < shoppingList.size)
    {
        println(shoppingList[counter])
        counter++
    }
    println()
    println("FOR LOOP")
//    For Loop
    for(shoppingItem in shoppingList)
    {
        println(shoppingItem)
    }

//    For loop ex 2
    println("FOR LOOP EX 2")
    for(i in 1..100)
    {
        println(i)
    }
}