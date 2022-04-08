//fun sum(a: Int, b: Int): Int {
//    return a + b
//}
fun main(args: Array<String>) {
    println("Hello World!")

    println("Program arguments: ${args.joinToString()}")
    println("hey man")
    var x: Int = 10
    println(message = "x = $x")
    print("the number is: ")
    println(3 + 3)
    //val name = "John"
    //name = "Robert"  // Error (Val cannot be reassigned)
    //println(name)
    //The val keyword is useful when you want a variable to always store the same value, like PI (3.14159...):

    val pi = 3.1419
//    println("pi is constant variable: " + pi)
    println("pi is constant variable: $pi") // this is better
    val firstName = "Bir "
    val lastName = "N"
    val fullName = firstName + lastName

    println(fullName)
//    sum(2, 6)
}



