package model

//data class ClothingItem(val type: String, val size: String, val price: Double)
sealed class ClothingItem(val type: String) {
    abstract val size: String
    abstract val price: Double
}

data class Shirt(override var size: String,
                 override var price: Double): ClothingItem("Shirt")

data class Pants(override var size: String,
                 override var price: Double): ClothingItem("Pants")

