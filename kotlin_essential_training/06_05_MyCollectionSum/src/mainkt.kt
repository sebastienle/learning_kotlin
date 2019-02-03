import model.ClothingItem

fun main(args: Array<String>) {

    val cart = mutableMapOf<ClothingItem, Int>()
    cart[ClothingItem("Shirt", "XL", 14.99)] = 2
    cart[ClothingItem("Pants", "32", 19.99)] = 4
    cart[ClothingItem("Hat", "8.5", 24.00)] = 1
    println(cart)

    var runningTotal: Double = 0.0
    for ((item, quantity) in cart) {
        println("Item ${item.type} @ ${item.price} = ${item.price * quantity}")
        runningTotal += item.price * quantity
    }
    println("-------------")
    println("Total: $runningTotal")

}