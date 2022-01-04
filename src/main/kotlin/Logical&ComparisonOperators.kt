fun main()
{
    val amIAdult = true
    val amIAProgrammer = true
    val amIAnAdultProgrammer = amIAdult && amIAProgrammer
    println("The answer to whether I am an Adult Programmer is $amIAnAdultProgrammer")

    val amIEitherAdultOrProgrammer = amIAdult || amIAProgrammer
    println("The answer to whether I am an Adult or a Programmer is $amIEitherAdultOrProgrammer")

    // ==, !=, >, <, >=, <=, ! are other operators

}