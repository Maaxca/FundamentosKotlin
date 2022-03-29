package com.example.fundamentoskotlin.clases

import com.example.fundamentoskotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone: Phone= Phone(123456)
    phone.call()
    phone.showNumber()
    println(phone.number)

    newTopic("Herencia")
    val smartphone=Smartphone(123456,true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")

    newTopic("Data Classes")
    val myUser= User(0,"Alain","Nicolas",Group.FAMILY.ordinal)
    val bro=myUser.copy(1,"Ivan")
    val friend=bro.copy(id=2, group = Group.FRIEND.ordinal)

    println(myUser.component3())
    println(myUser)
    println(bro)
    println(friend)

    newTopic("Funciones de alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()
    }

    friend.group=Group.WORK.ordinal
    friend.name="Juan"
    friend.lastName="Tellez"
    friend.apply {
        group=Group.WORK.ordinal
        name="Juan"
        lastName="Tellez"
    }
    println(friend)
}