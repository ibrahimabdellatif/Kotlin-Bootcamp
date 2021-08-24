fun main(args : Array<String>){
    //handle null occur
    var mood = readLine()?:""

    repeat(10) { println(whatShouldIDoToday(mood))}
}
fun whatShouldIDoToday(
    mood:String ,
    weather:String = "sunny" ,
    temperature:Int = 24):String{

    //another useful tip, you can use when statement with out any parameter
     when {
        mood == "happy" && weather == "Sunny" -> "go for a walk"
        else -> "Stay home and read."
    }

    return when{
        mood == "sad" && weather == "rainy" && temperature ==0 -> "stay in bed"
        temperature >30 ->"go swimming"
        else->"bad things"
    }
}

/**
 * fun main(args: Array<String>) {
println(whatShouldIDoToday("happy", "sunny"))
println(whatShouldIDoToday("sad"))
print("How do you feel?")
println(whatShouldIDoToday(readLine()!!))
}

fun isVeryHot (temperature: Int) = temperature > 35
fun isSadRainyCold (mood: String, weather: String, temperature: Int) =
mood == "sad" && weather == "rainy" && temperature == 0
fun isHappySunny (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24) : String {
return when {
isVeryHot(temperature) -> "go swimming"
isSadRainyCold(mood, weather, temperature) -> "stay in bed"
isHappySunny(mood, weather) -> "go for a walk"
else -> "Stay home and read."
}
}

 -------------
fun main(args: Array<String>) {
var fortune: String = ""
repeat (10) {
fortune = getFortune(getBirthday())
println("\nYour fortune is: $fortune")
if (fortune.contains("Take it easy")) break;
}
}
 -----------
fun main(args: Array<String>) {
var fortune: String = ""
while (!fortune.contains("Take it easy")) {
fortune = getFortune(getBirthday())
println("\nYour fortune is: $fortune")
}
}
 */