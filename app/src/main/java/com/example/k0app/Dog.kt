package com.example.k0app

class Dog {
    val name: String
    val age:Int
    constructor(){
        name ="No name"
        age = 0
    }

    constructor(nombreParam: String, edadParam: Int){
        name =nombreParam
        age =edadParam
    }

}