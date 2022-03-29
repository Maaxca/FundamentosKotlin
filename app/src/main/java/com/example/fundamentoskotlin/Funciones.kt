package com.example.fundamentoskotlin

import kotlin.math.abs

fun main(){
    sayHello()

    newTopic("Argumentos")

    //println(sum(2,3))
    val a=2
    val b=3
    println("$a+$b=${sum(a, b)}")
    println("$a-$b=${sub(a, b)}")

    newTopic("Infix")
    val c=-3
    println("$a+$c=${sum(a, c.enableAbs(false))}")
    println("$a+$c=${sum(a, c.enableAbs(true))}")

    newTopic("Sobrecarga")
    showProduct("Soda","10%")
    showProduct("Pan")
}

fun sayHello():Unit {//Unit=void
    println("Hola Kotlin")
}

fun sum(a:Int,b:Int):Int{
    return a+b
}
fun sub(a:Int,b:Int):Int{
    return a-b
}

infix fun Int.enableAbs(enable:Boolean)=if(enable) abs(this)else this

fun showProduct(name:String,promo:String="Sin Promocion"){
    println("$name=$promo")
}
