fun main()
{
    //The list below is an immutable list. So, once initialized, it cannot be changed
    val shoppingList = listOf<String>("Apple","Banana","Carrot")
    println(shoppingList[1])
    println(shoppingList)

    //The list below is a mutable List, which can be changed at any point
    val shoppingList1 = mutableListOf("Apple","Banana","Orange")
    shoppingList1.add("Carrot")
    println(shoppingList1[3])
    println(shoppingList1)
}