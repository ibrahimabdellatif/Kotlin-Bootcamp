import java.util.*

fun main(args: Array<String>) {
//    if (args[0].toInt() < 12) println("Good morning, Kotlin")
//    else println("Good night, Kotlin" )
    //i change the argument in main fun form run > edit configration
    // println("hello , ${args[0]}")
    //dayOfWeek()

//    print("Your fortune is: ${getFortuneCookie()}")


}

fun getFortuneCookie(): String {
    var listOfFortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    println("Enter your birthday")
    var birthday = 0
    var x = getBirthday(birthday)
    return listOfFortunes[x.rem(listOfFortunes.size)]
}

fun getBirthday(birthday: Int): Int {
    var x = birthday
    x = readLine()?.toIntOrNull() ?: 0
    return x
}


fun dayOfWeek() {
    var day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    //or you can put when statement inside println()
    when (day) {
        1 -> println("Sunday")
        2 -> println("monday")
        3 -> println("Tuesday")
        4 -> println("wednesday")
        5 -> println("thursday")
        6 -> println("friday")
        7 -> println("saturday")
    }

}

fun listFilterMap() {
    val decoration = listOf("rock", "paper", "panda", "person", "arm")
    //using filter to show list of word start with p letter
    println(decoration.filter { it[0] == 'p' })
    //apply filter lazily
    val filters = decoration.asSequence().filter { it[0] == 'p' }
    println(filters.toList())
    //apply map lazily
    val lazyMap = decoration.asSequence().map {
        //it will print every element inside the list in new line
        println("map:$it")
        it
    }
    println(lazyMap.toList())
    //it will print first value in the list
    println(lazyMap.first())
}

fun moreWithFilters() {
    val spices = listOf(
        "curry", "pepper", "cayenne", "ginger",
        "red curry", "green curry", "red pepper"
    )
//    val orderSpices2 = spices.sortedBy { it.length } //orderspices = orderspices2
    val orderSpices = spices.sortedWith(compareBy { it.length })
    //select value that start with c letter and end with e letter
    val spicesFilter = spices.filter { it[0] == 'c' && it.endsWith('e') }
    spices.filter { it.startsWith('c') }.filter { it.endsWith('e') }
    spices.filter { it.startsWith('c') && it.endsWith('e') } //last three lines is the same
//    val spicesThree = spices.filter { it[0] =='c' && if  }
    val spicesSlice = spices.slice(0..2)
    val spicesFirstThree = spicesSlice.filter { it[0] == 'c' }
    spices.take(3).filter { it.startsWith('c') } //same meaning of top
    println(spicesFirstThree)
//    println(spicesFilter)
}
fun lambdas(){
    //using lambdas
    val swim = { println("hello kotlin with lambda") }
//    print(swim())
    var dirty = 20
    val waterDirty = { dirty: Int -> dirty / 2 } //this called lambda
    val waterDirty2: (Int) -> Int = { clean -> dirty / 2 } //so waterDirty == waterDirty2
//    print(waterDirty(dirty))
    //when use Random() method use var with it to change the value every time
    var rollDice = { Random().nextInt(12) + 1 }

    //don't forget before use lambda type () after variable name
    print(rollDice())
}
/**
 * - every thing in kotlin have an expression
 * - when condition make break auto after choice the condition
 * - filter is powerful in kotlin so use it
 * - starting with lambdas
 */