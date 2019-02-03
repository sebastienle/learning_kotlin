data class ClothingItem constructor (var type: String?,
                        val size: String,
                        var price: Double) {

    init {
        type = type?.toUpperCase()
    }

    constructor(size: String, price: Double): this(null, size, price) {
        type = "Unknown"
    }

}