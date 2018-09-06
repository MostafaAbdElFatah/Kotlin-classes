package Aquarium

import java.lang.Math.PI

open class Aquarium (var width:Int = 20 , var height: Int = 40 , var length :Int = 100) {


    open var volume :Int
        get() {
            return height * length * width / 1000
        }
        set(value) { height = (value * 1000) / (width * length) }
    open var water = volume * 0.9
    constructor(numberOfFish:Int) : this(){
        val water = numberOfFish * 2000
        val tank = water + water * 0.1
        height = (tank/(length * width)).toInt()
    }
}

class TowerTank :Aquarium(){
    override var water = volume * 0.8
    override var volume : Int
        get() = (width * height * length / 1000 * PI ).toInt()
        set(value) { height = (value * 1000) / (width * length)}

}

/**
class Aquarium (width:Int = 20 , height: Int = 40 , length :Int = 100) {
    var width  : Int  = width
    var height : Int  = height
    var length : Int  = length

    var volume :Int
        get() {
            return height * length * width / 1000
        }
        set(value) { height = (value * 1000) / (width * length) }
    //fun volume() = this.height * this.width * this.length / 1000
    /**
    fun volume(): Int {
    return this.height * this.width * this.length / 1000
    }*/
}*/