fun main(args: Array<String>) {

    // it is when we instantiate this object that we define what the clickMe method will actually do!
    val stateful = StatefulClass(object: ClickListener {
        override fun onClick(event: ClickEvent) {
        //override fun onClick(x: Int, y: Int) {
            println("Click at ${event.x}, ${event.y}")
            //println("Click at $x, $y")
        }
    })
    println("Listener initialized")

    stateful.clickMe(5, 18)
    stateful.clickMe(45, 57)


}

class ClickEvent(val x: Int, val y: Int)

interface ClickListener {
    fun onClick(event: ClickEvent)
    //fun onClick(x: Int, y: Int)
}

class StatefulClass(listener: ClickListener) {
    private var _clickListener: ClickListener? = listener

    fun clickMe(x: Int, y: Int) {
        _clickListener?.onClick(ClickEvent(x,y))
        //_clickListener?.onClick(x,y)
    }
}

