import kotlin.math.*

fun main(args: Array<String>) {
    val num1 = 15
    val num2 = 10

    val sum = num1.plus(num2)
    println("sum=$sum")

    val difference = num1.minus(num2)
    println("difference=$difference")

    val product = num1.times(num2)
    println("product=$product")

    val quotient:Double = num1.toDouble().div(num2)
    println("quotient=$quotient")

    val remainder = num1.rem(num2)
    println("remainder=$remainder")


    val neg = -152.5
    val absolute = abs(neg)
    println("absolute=$absolute")
    println("rounded=${round(absolute)}")
    // if you have an import statement, you do not need to call the Math class

    println("Have a piece of $PI")
}