package com.example.lib

open class Student constructor(var name: String, var english: Int, var math: Int){
    constructor(name: String): this(name, 0, 0) {}
    constructor(): this("", 0, 0) {}

    fun print() {
        println("$name $english $math ${average()} ${highest()} ${grading()}")
    }
    fun average() = (english+math)/2

    fun highest() = if (english > math) "english" else if (english==math)  "english = math" else "math"

    fun grading() = when (average()/10) {
            10 -> "A"
            9 -> "A"
            8 -> "B"
            7 -> "C"
            6 -> "D"
            else -> "F"
        }
}

fun main() {
    val jenny = Student("Jenny", 70, 80)
    val kui = Student("Kui")
    jenny.print()
    kui.print()
}