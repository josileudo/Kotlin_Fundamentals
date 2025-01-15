package aula_criando_classes

class Person(val name: String, var age: Int) {
    fun work(){
        println("$name with $age years, are working...")
    }
}

fun main() {
    val jose: Person = Person(name = "José", age = 20)
    jose.work()
}