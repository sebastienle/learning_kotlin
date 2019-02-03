import model.ClothingItem

fun main(args: Array<String>) {

    // mutable set
    var colorSet = mutableSetOf("Red", "Green", "Blue")
    println(colorSet)

    colorSet.add("Purple")
    colorSet.remove("Green")
    println(colorSet)

    // you cannot remove from a set using an index
    // but you can create a list from a set and then manipulate the list
    val colorList = colorSet.toMutableList()
    colorList.removeAt(0)
    println(colorList)
    colorList.add("Purple")
    println(colorList)

    // but if I switch this list which contains a duplicate and create a set from it, it will eliminate the dup
    val newSet = colorList.toMutableSet()
    println(newSet)
    // this works well with data classes because it determines which are duplicates by looking at all of the data
    // objects properties
    val itemSet = mutableSetOf<ClothingItem>()
    itemSet.add(ClothingItem("Shirt", "XL", 14.99))
    itemSet.add(ClothingItem("Shirt", "XL", 14.99))
    println(itemSet)
    itemSet.add(ClothingItem("Shirt", "M", 14.99))
    println(itemSet)
}
