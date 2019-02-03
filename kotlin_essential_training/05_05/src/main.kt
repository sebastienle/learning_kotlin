fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    println(item)

    item.price = 15.99
    println(item)

    val item2 = ClothingItem("M", 14.95)
    println(item2)
}
