package com.project.firstapp

class Person {
    var id="15121"
    var name="Resul"
    var surname="Akkız"

    constructor( id:String, name:String, surname:String){
        this.id=id
        this.name=name
        this.surname=surname
    }

    fun show(message: String){
        println("Show function triggered: $message")
    }

    override fun toString(): String {
        return "$id , $name, $surname"
    }
}

class Person2(val id:String,val name:String, val surname:String){

    override fun toString(): String {
        return return "$id , $name, $surname"
    }

}

