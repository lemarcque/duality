package venn


// Main function
fun main(args: Array<String>) {

    // Create an set of even number
    val A = SetKotlin(1, 2, 3, 4, 5)
    val B = SetKotlin(1, 4, 7, 9)



    println("Set A : ${A}")
    println("Set B : ${B}")
    println("Intersection of A and B is ${A.Intersection(B)}")
    println("Union of A and B is ${A.union(B)}")
    println("Difference of A and B is ${A.difference(B)}")

    println(A
        .union(SetKotlin(0, 2, 4, 6))
        .union(SetKotlin(1, 3, 5, 7))
        .union(SetKotlin(100, 200, 300, 400)))
}