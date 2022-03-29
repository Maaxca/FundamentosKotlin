package com.example.fundamentoskotlin.clases

class Smartphone(number:Int,val isPrivate:Boolean):Phone(number) {
    override fun showNumber() {
        if(isPrivate){
            println("Desconocido")
        }
        else{
            super.showNumber()
        }
    }
}