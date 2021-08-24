package Aquarium

//you can write the constructor side the class
//to make class able to be inherit from another class or subclasses add open keyword before it
open class Aquarium(var width: Int = 20, var height: Int = 40, var length: Int = 100) {
    //    var width: Int = 20
//    var height: Int = 40
//    var length: Int = 100
    /**
     * init{} >> The code inside the init block is the first to be executed
     * when the class is instantiated. The init block is run every time the class is instantiated,
     * with any kind of constructor as we shall see next.
     * Multiple initializer blocks can be written in a class. They’ll be executed sequentially
     */
    init {
        // println("welcome to kotlin init")
    }

    fun volume() = println((width * height * length) / 1000)
    var volume2: Int
        get() = (width * height * length) / 1000 // volume() method is the same volume2 variable
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open var water = volume2 * 0.9

    //to create constructor in kotlin
    constructor(numberOfFish: Int) : this() {

    }
}

open class Book(val title: String, val author: String) {
    private var currentPage = 1
    open fun readPage() {
        currentPage = currentPage++
    }

}

class EBook(title: String, author: String, val format: String = "text") : Book(title, author) {
    private var wordRead = 0

    override fun readPage() {
        this.wordRead = wordRead + 250

    }
    init {
        print(wordRead)
    }
}

class TowerTank() : Aquarium() {
    override var water = volume2 * 0.8
}


class Spice(val name: String, val spiciness: String = "mild") {

    private val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    val spice = Spice("cayenne", spiciness = "spicy")
    val spicelist = spices1.filter { it.heat < 5 }
    fun makeSalt() = Spice("Salt")
}

