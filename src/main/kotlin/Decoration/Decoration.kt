package Decoration
//data class section
fun main(args:Array<String>){
makeDecoration()
    var color:Color
}
fun makeDecoration(){
    val d1 = Decoration("white rock")

    d1.age = 23
    print("${d1.age}  ${d1.rocks} : API ${d1.API}")
    //if decoration class is not data output will be Decoration.Decoration@312b1dae,
    // if it data it will be Decoration(rocks=white rock)
}

data class Decoration(val rocks:String):Seal(){
    var age:Int = 16
}

enum class Color(val rgb:Int){
    RED(34432),
    GREEN(3444322),
    BLUE(382389)
}
sealed class Seal(var API:Int = 32987983){
    init {

        var APIe = this.API
    }
}