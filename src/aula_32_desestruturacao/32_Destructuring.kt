package aula_32_desestruturacao

data class Person(val name: String, val lastName: String, val age: Int)

fun main() {
    val (name, lastName, age) = Person(name = "John", lastName = "Silva", age = 30)
}