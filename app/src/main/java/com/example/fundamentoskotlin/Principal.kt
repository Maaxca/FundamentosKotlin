package com.example.fundamentoskotlin

const val separator="=================="

fun main(){
    newTopic("Hola Kotlin")


    newTopic("Variables y constantes")
    //val a=2
    //val a="Hola"
    val a=true
    println("a=$a")

    //var b=2
    var b:Int=5
    println("b=$b")

    var objNull:Any?=null
    objNull="Hola"

    println(objNull)
}

fun newTopic(topic:String){
    print("\n$separator $topic $separator\n")
}