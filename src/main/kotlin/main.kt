import java.util.*
import kotlin.math.pow

fun main() {
    //val >> is final in java so you can't change the value of it , but use >> var

    //put ? after data type to assign value to null
    var i: Int? = null
    //make list or the element to be null
    var everMoreFish: List<Nothing?> = listOf(null, null)
    var moreFish: List<String>? = null
    //this is simple use decrease() method condition statement check if variable i is null if it null return value after colon >> 12
    i = i?.dec() ?: 12
    // print(i)
    //this code check if nulltest var is not null inc it by 1
    var nullTest: Int? = 2
//    println(nullTest?.inc() ?:0)

    /**
     * String and condition section
     */
    val fishNumber = 50
    val fishPlanet = 12
    if (fishNumber > fishPlanet) println("fishIsGood")
    else println("fishIsBad")
    println("my" == "My")
    println("here i have $fishNumber of fish and $fishPlanet of fish plant")
    println("so total is ${fishNumber + fishPlanet} it's great!")
    if (fishNumber in 1..100) println(fishNumber) else println("badFish")
    // when in kotlin is >> switch case in other languages
    when (fishNumber) {
        0 -> println("Empty tank when")
        50 -> println("Full tank when")
        100 -> println("Grate tank when")
    }
    var welcomeMessage = "Hello and welcome to kotlin"
    when
            (welcomeMessage.length) {
        0 -> println("Nothing to say")
        in 1..50 -> println(welcomeMessage)
        else -> println("to long string!")
    }

    var snapper = "snapper"
    var trout = "trout"
    var haddock = "haddock"
    println("whether you do or don't like to eat these kinds of fish $snapper , $trout , $haddock")
    var fishName = "snapper"
    when
            (fishName.length) {
        0 -> println("an error messgae")
        in 3..12 -> print("\nGood $fishName , ${fishName.length}")
        else -> print(fishName)
    }

    //hint about val
    val myList = mutableListOf("tuna", "shark", "salmon")
//    myList = mutableListOf("koi" , "goldFish") so if you write like these it's give you error because it is val
    println(myList)
    myList.remove("shark")
    println(myList)

    /**
     * Arrays Section "https://youtu.be/DUs1lPAcPXI"
     */
    println(">>>>>>>>>>> Arrays section <<<<<<<<<<<<<")
    var fish = 12
    var plants = 5
    var swarm = listOf(fish, plants)
    for (i in swarm) println(i)
    val school = arrayOf("shrak", "tune", "goldFish")
    val numbers = intArrayOf(1, 2, 3)
    val mix = arrayOf("fish", 5)
    println(Arrays.toString(mix))
    var bigSwarm = arrayOf(swarm, arrayOf("fish", "green fish", "white fish"))
    println(Arrays.toString(bigSwarm))
    val array = Array(5) { it * 5 }
    println(array.asList())
    for ((index, g) in swarm.withIndex()) {
        println("Fish At $index is $g")
    }
    val array3 = Array(7) { 1000.0.pow(it) }

    /**
     * it here refer to index of array to it value.pow(0) and store value in index 0 and so on
     * >>Immutable variables are the safest option when you know that a variable will never need to change values.
     */
    val sizes = arrayOf(
        "byte", "kilobyte", "megabyte", "gigabyte",
        "terabyte", "petabyte", "exabyte"
    )
    for ((i, value) in array3.withIndex()) {
        println("1 ${sizes[i]} = ${value.toLong()} bytes")

    }
    
}