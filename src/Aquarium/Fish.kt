package Aquarium

class Fish(val friendly:Boolean = true , volumeIsNeeded:Int) {
    val size:Int
    init {
        println("first init block")
    }
    constructor() :this(true,9){
        println("Running second constructor")
    }
    init{
        println("second init block, init the size")
        if (friendly)
            size = volumeIsNeeded
        else
            size = volumeIsNeeded * 2
    }

    init {
        println("constructed fish of size $volumeIsNeeded final size $size")
    }

    init {
        println("Last init block")
    }
}

fun makeDefaultFish () = Fish(true, 50)

fun fishExample(){
    val fish = Fish(true,20)
    println("Is the Fish Friendly ? ${fish.friendly} . It need Volume ${fish.size}")
}