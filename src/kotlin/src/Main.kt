import arithmetic.add
import arithmetic.divide
import arithmetic.multiply
import arithmetic.substract


fun main(args: Array<String>) {

    // addition
    val sum = add(9, 3)  // result : 12
    val difference = substract(9, 3)  // result : 6
    val product = multiply(9, 3)  // result : 27
    val quotient = divide(9, 3) // result : 3

    println("Sum : ${sum}")
    println("difference : ${difference}")
    println("product : ${product}")
    println("quotienrt : ${quotient}")

}
