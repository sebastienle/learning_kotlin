fun main(args: Array<String>) {

    try {
        print("Number 1: ")
        val number1 = readLine()
        val double1: Double = number1!!.toDouble()

        print("Number 2: ")
        val number2 = readLine()
        val double2 = number2!!.toDouble()

        print("Select an operation (+ - / *): ")
        val operation = readLine()
        var answer = 0.0

        when (operation) {
            "+" -> answer = addValues(double1, double2)
            "-" -> answer = substractValues(double1, double2)
            "*" -> answer = multiplyValues(double1, double2)
            "/" -> answer = divideValues(double1, double2)
            else -> {
                throw Exception("Unknown operation")
            }
        }

        println("The answer is $answer")

    } catch (e: NumberFormatException) {
        println("${e.message} is not a number")
    } catch (e: Exception) {
        println("${e.message}")
    }
}

fun addValues(num1: Double, num2: Double): Double {
    return num1 + num2
}

fun substractValues(num1: Double, num2: Double): Double {
    return num1 - num2
}

fun multiplyValues(num1: Double, num2: Double): Double {
    return num1 * num2
}

fun divideValues(num1: Double, num2: Double): Double {
    return num1 / num2
}