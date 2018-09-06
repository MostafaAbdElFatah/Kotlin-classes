import Aquarium.*


fun main(args:Array<String>){
    builtAquarium()
}

fun builtAquarium() {
    val myAquarium = Aquarium()
    myAquarium.volume = 50
    println("length:${myAquarium.length}" +
            ", height:${myAquarium.height}" +
            ", width:${myAquarium.width}" +
            ", Volume ${myAquarium.volume} ")
    val myAquarium1 = Aquarium(height = 10 , width = 10)
    println("length:${myAquarium1.length}" +
            ", height:${myAquarium1.height}" +
            ", width:${myAquarium1.width}" +
            ", Volume ${myAquarium1.volume} ")
    val myAquarium2 = Aquarium(numberOfFish = 60)
    println("length:${myAquarium2.length}" +
            ", height:${myAquarium2.height}" +
            ", width:${myAquarium2.width}" +
            ", Volume ${myAquarium2.volume} ")
    fishExample()
    makeDefaultFish()
    makeFish()
}

fun makeFish() {
    val shark = Shark()
    val plecostumos = Plecostumos()

    println("Shark: ${shark.color}, Plecostumos: ${plecostumos.color} ")
    shark.eat()
    plecostumos.eat()
    feedFish(shark)
    feedFish(plecostumos)
}

fun feedFish(fish: FishAction){
    fish.eat()
}
