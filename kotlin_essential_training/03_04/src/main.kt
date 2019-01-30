fun main(args: Array<String>) {
    val num1 = 10
    val num2 = 15

    val match:Boolean = (num1 == num2)
    println("March = $match")

    val match2 = num1.equals(num2)
    println("March2 = $match2")
    // looks the same as the previous but it is slightly different

    println("Comparison result = ${num1.compareTo(num2)}")
}