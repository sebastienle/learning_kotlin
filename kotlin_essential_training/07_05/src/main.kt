import model.ClothingItem
import model.Pants
import model.Shirt

fun main(args: Array<String>) {

    // Clothing item cannot be instantiated directly anymore
    //val item = ClothingItem("Shirt", "XL", 19.99)
    //println(item)

    val item1 = Shirt("XL", 14.99)
    val item2 = Pants("32", 24.99)

    val mostExpensive: ClothingItem =
            if (item1.price > item2.price) item1 else item2

    val instructions = when(mostExpensive) {
        is Shirt -> "Button it!"
        is Pants -> "Buckle it!"
    }
    println(instructions)
}
