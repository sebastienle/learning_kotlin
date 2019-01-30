fun main(args: Array<String>) {
    val myInt = 42
    // this would return an error
    //val myLong:Long = myInt
    val myLong:Long = myInt.toLong()

    // reflection
    println("The type of myLong is ${myLong::class.simpleName}")
    println("The type of myLong is ${myLong::class.qualifiedName}")

    val myLong2 = 42.9
    var myInt2 = myLong2.toInt()
    println("The value of myLong is $myLong2")
    println("The value of myInt2 is $myInt2")
    // this downcasts so we have lost precision

    val myInt3 = 568
    val myDouble3 = myInt3.toDouble()
    println("The value of myDouble3 is $myDouble3")
}