package com.example.lib

class Student constructor(var name: String, var english: Int, var math: Int){
    constructor() : this("",0,0) {
        println("Hi please key in name and scores")
    }
    constructor(name: String) : this(name, 0,0) {
        println("Hi $name, please key in scores")
    }

    fun avg() = (english+math)/2
}

fun main() {
    val jenny = Student("Jenny")
    val kui = Student("Kui", 60, 80)
}