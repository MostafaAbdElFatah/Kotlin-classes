package Aquarium


abstract class AquariumFish : FishAction {
    abstract val color:String
    override fun eat() = println("yum")
}
/*
class Shark : AquariumFish(), FishAction{
    override val color = "gray"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostumos :AquariumFish(), FishAction {
    override val color = "gold"
    override fun eat() {
        println("munch on algae")
    }
}
*/

class Shark(fishColor: FishColor = GrayFish) : FishAction, FishColor by GrayFish{
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostumos : FishAction, FishColor by GoldenFish {
    override fun eat() {
        println("munch on algae")
    }
}

interface AquariumAction{
    fun eat()
    fun jumb()
    fun clean()
    fun catchFish()
    fun swim(){
        println("Swim")
    }
}

interface FishAction{
    fun eat()
}

interface FishColor{
    val color:String
}

// object mean one instance of class
object GoldenFish: FishColor{
    override val color = "gold"
}

object GrayFish: FishColor{
    override val color = "gray"
}