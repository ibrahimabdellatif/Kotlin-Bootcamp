package Aquarium

import Decoration.Seal

fun main(args: Array<String>) {
    //lambda test
    val waterFilter = {dirty:Int ->dirty/2} // this is lambda
    println(waterFilter(30)) // output 15
    data class Fish(val name:String)
    val myFish = listOf(Fish("Flipper") , Fish("Moby Dick") , Fish("Dory"))
    //get the index that have letter i in the String
    println(myFish.filter { it.name.contentEquals("i") }.joinToString(" "){it.name})








    buildAquarium()
    print(my)
}

val my: String = "hello"
fun buildAquarium() {
    var myAquarium = Aquarium()
    println(
        "width: ${myAquarium.width}\n height: ${myAquarium.height}\n" +
                "length: ${myAquarium.length}"
    )
    myAquarium.volume()
    println(myAquarium.volume2)
    var smallAquariun = Aquarium(10, 20, 30)
    var testAquarium = Aquarium(numberOfFish = 20)
    var eBook = EBook("hello", "kotlin")

    val fish = FishColor()
    val fishColor = Fish()
    println(fish.color)
    fishColor.eat()
    val goldenColor = GoldenColor()
    print(goldenColor.color)
}
/**
 * in kotlin every thing is public
 */

enum class Direction {
    NORTH, EAST, WEST, SOUTH, START, END
}

class Game {
    var path = mutableListOf<Direction>(Direction.START)
    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("Game Over: $path"); path.clear(); false }
}
//fun main(args: Array<String>) {
//    val game = Game()
//    println(game.path)
//    game.north()
//    game.south()
//    game.east()
//    game.west()
//    game.end()
//    println(game.path)
//}