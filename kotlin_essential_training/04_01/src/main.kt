fun main(args: Array<String>) {
    val num1 = 4.0
    val num2 = 3.5

    //val result = addValues(num1, num2)
    val result = addValues(param2 = num2, param1 = num1)
    println("The result is $result")

    //val result2 = calcValues(num1, num2)
    val result2 = calcValues(num1, num2, "-")
    println("The result is $result2")

    changeSomething(5.0)

    val sum: Int = addValues(1, 2, 3, 7)
    println("The sum is $sum")
}

fun addValues(param1: Double, param2: Double) : Double {
    return param1 + param2
}

fun calcValues(param1: Double, param2: Double, op: String = "+"): Double {
    if (op.equals("+")) {
        return param1 + param2
    } else if (op.equals("-")) {
        return param1 - param2
    } else {
        return -1.0
    }
}

fun changeSomething(param: Double) {
    //param ++
    var copy = param
    copy ++
    println("Copy is $copy")
}

fun addValues(vararg numbers:Int) : Int {
    var result = 0
    for (i in numbers) {
        result += i
    }
    return result
}