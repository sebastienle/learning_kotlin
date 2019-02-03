fun main(args: Array<String>) {

    // create a function as a reference variable
    val helloWorld = {
        println("Hello World!")
    }
    helloWorld()
    helloWorld.invoke()

    val sayHello = {
        // user: String -> println("Hello, $user")
        user: String, age: Int -> println("Hello, $user you are $age years old")
    }
    //sayHello("Seb")
    sayHello("Seb", 45)

    val states = arrayOf("New York", "New Hampshire", "Vermont", "Rhode Island", "Nebraska")
    // Now I want to sort that data. But sortedBy expects an implementation of the Comparable interface.
    // I could pass an anonymous object that implements this interface but easier with lambda expression.
    // Between the braces, I'll pass in the value that the interface expects.
    // This will sort the list by the length of the state name
    // val sorted = states.sortedBy { state -> state.length }
    // an even shorter version, using it instead of a parameter name you defined
    val sorted = states.sortedBy { it.length }
            .filter { it.startsWith("n", true) }
    for (state in sorted) {
        println(state)
    }
}
