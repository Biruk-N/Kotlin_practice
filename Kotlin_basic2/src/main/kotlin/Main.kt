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
//    Kotlin Operators
    var sum1 = 100 + 50       // 150 (100 + 50)
    var sum2 = sum1 + 250     // 400 (150 + 250)
    var sum3 = sum2 + sum2
//    Kotlin Strings
    var greeting = "Hello"
//    Note: If you want to create
//    a String without assigning the value (and assign the value later),
//    you must specify the type while declaring the variable:
    var greeting2: String = "Hello"
    println(greeting)
    println(greeting2)

    var txt = "Hello World"
    println(txt[0]) // first element (H)
    println(txt[2]) // third element (l)
    println("The length of the txt string is: " + txt.length)
    println(txt.toUpperCase())
    println(txt.toLowerCase())
    println(txt)//Hello World

    var txt1 = "Hello World"
    var txt2 = "Hello World"
    println(txt1.compareTo(txt2))
    println(txt.indexOf("o"))//4

    var txtTest = "It's alright"
    println(txtTest)
//    concatenation
//    println(txt + " " + txtTest)
//    but better way is String Templates/Interpolation
    println("$txt $txtTest")
    println("$txt \n\t\t$txtTest")

    var fName = "Bir "
    var lName = "N"
    println(fName.plus(lName))

//    Kotlin Booleans
    val isKotlinFun: Boolean = true
    val isFishTasty: Boolean = false
    println(isKotlinFun)   // Outputs true
    println(isFishTasty)   // Outputs false
//    Kotlin If ... Else

}



