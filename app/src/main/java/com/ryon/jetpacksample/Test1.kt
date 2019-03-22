package com.ryon.jetpacksample


fun main() {
//    Tree("123").printName();
    Liyang("liyang").call()
//    C().c()
}

open class Person (val name:String) {
    open fun call(){
        print("call me $name")
    }
}

class Liyang(name:String) : Person(name) {
   override fun call(){
       super.call()
       print("Liyang call me $name")
   }
}

//open class A {
//    val isEmpty: String=""
//    [<getter>]
//}


