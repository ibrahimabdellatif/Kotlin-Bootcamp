package Aquarium

abstract class FishAquarium{
     abstract var color:String
}
class FishColor() :FishAquarium(){
     //or you can pass this value inside the class declaration with out value
     override var color: String = "green"
}

class Fish() :FishAquarium(),FishAction{
     //or you can pass this value inside the class declaration with out value
     override var color: String = "green"
     override fun eat() {
          println("hunt and run to eat")
     }
}
interface FishAction{
     fun eat()
}
interface FishColorInterface{
     val color:String
}

//instead of this we can use object keyword
class GoldenColor:FishAction by PrintingFishAction("a lot of food"),FishColorInterface by Golden{
     override fun eat() {
     }
}
object Golden:FishColorInterface{
     override val color: String = "Golden"
}
class PrintingFishAction(val food:String):FishAction{
     override fun eat() {
          println(food)
     }
}