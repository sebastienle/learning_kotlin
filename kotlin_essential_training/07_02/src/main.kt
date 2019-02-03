fun main(args: Array<String>) {

    val buster = Retriever()
    //buster.speak()
    makeItTalk(buster)
    // because I have an interface that guarantees an implementation of the speak method, I can write a function
    // like makeItTalk

    reportBreed("Buster", buster)
    // interesting that the function uses class.simpleName and that this returns the name of the class that
    // implements this interface and not the name of the interface itself



}

fun makeItTalk(dog: Retriever) {
    dog.speak()
}

fun reportBreed(name: String, dog: Dog) {
    println("$name is a ${dog::class.simpleName}")
    println("This dog's fur is ${dog.fur}")
}

interface Dog {
    var fur: String
    fun speak() {
        println("Woof!")
    }
}

interface Cat {
    var fur: String
    fun speak() {
        println("Meow!")
    }
}

class Retriever: Dog, Cat {
    override var fur: String
        get() = "golden"
        set(value) {}

    override fun speak() {
        // because this class implements both interface of Dog and Cat, we have to specify which one we are calling
        super<Dog>.speak()
        super<Cat>.speak()
    }

}