package aula_criando_classes

open class Animal(val name: String) {
    open fun sound() {
        println("$name: som")
    }
}

// Com o override eu consigo sobrescrever a função que está dentro da classe aberta chamada
class Dog: Animal(name = "Doginho") {
    override fun sound() {
        println("$name: Uau")
    }
}

fun main() {
    val dog = Dog()
    dog.sound()
}