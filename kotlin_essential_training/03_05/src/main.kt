fun main(args: Array<String>) {
    var num1 = 15
    val num2 = 10

    val sum = num1 + num2
    println("Sum = $sum")

    val sum2 = num1.plus(num2)
    println("Sum2 = $sum2")

    val diff = num1 - num2
    println("Diff = $diff")

    num1 ++
    println("Num1 = $num1")

    num1.inc()
    println("Num1 = $num1")
    // why wasn't this incremented? Look at the bytecode
    // inc function does not affect the variable, it returns a new variable

    println("The value of num1 is ${num1++}")
    println("Num1 = $num1")
}