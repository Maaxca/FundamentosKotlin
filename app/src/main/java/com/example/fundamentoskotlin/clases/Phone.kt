package com.example.fundamentoskotlin.clases

open class Phone(val number: Int){
    fun call(){
        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi numero es: $number")
    }
}