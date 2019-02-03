fun main(args: Array<String>) {

    // the Any class
    val x:Any = Any()
    println(x)

    // quick implementation of my SuperClass - it did not override toString at that point
    val sup = SuperClass(42)
    println(sup)

    val sub = SubClass(53)
    println(sub)

    println(sup.multiply(100))
    println(sub.multiply(100))

}

open class SuperClass(anInt: Int) {
    protected val _anInt = anInt

    override fun toString(): String {
        //return "SuperClass{anInt: $_anInt}"
        //instead of hard coding the class name, we can fetch it dynamically
        return "${this::class.simpleName}{anInt: $_anInt}"
    }

    open fun multiply(factor: Int): Int {
        return _anInt * factor
    }
}

class SubClass (anInt: Int): SuperClass(anInt) {
//    override fun toString(): String {
//        return "SubClass{anInt: $_anInt}"
//    }

    override fun multiply(factor: Int): Int {
        return super.multiply(factor) * factor
    }
}