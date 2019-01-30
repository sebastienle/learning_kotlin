fun main(args: Array<String>) {
    var aString = "Hello!"
    println(aString)

    val empty = String()
    println("'$empty'")

    var charArray = aString.toCharArray()
    println(charArray.toList())

    var byteArray = aString.toByteArray()
    println(byteArray.toList())

    aString += " and Welcome!"
    println(aString)

    val len = aString.length
    for (i in 0 until len) {
        val c = aString.get(i)
        println(c)
    }

    val p = aString.indexOf("W")
    val sub = aString.substring(p)
    println(sub)

    val string2 = aString
    val match = aString.equals(string2)
    println("Do they match? $match")

    val string3 = aString.toUpperCase()
    val match2 = aString.equals(string3)
    println("Do they match? $match2")
    val match3 = aString.equals(string3,true)
    println("Do they match? $match2")

}