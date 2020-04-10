package jp.techacademy.mami.ootani

abstract class Animal {

    var name: String
    var age: Int

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }

    abstract fun say()
}