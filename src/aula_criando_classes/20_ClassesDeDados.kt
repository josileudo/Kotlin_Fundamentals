package aula_criando_classes

class UserClass(var name: String, var age: Int)
data class UserDataClass(var name: String, var age: Int,)

// usado na atribuíção de dados e facilidade na manutenção de dados

fun main() {
    val userClass = UserClass(name = "john", age=18)
    val userDataClass = UserDataClass(name = "mary", age=45)

    // toString
    println(userClass.toString())
    println(userDataClass.toString())

    // equals
    val jose = UserDataClass(name = "Jose", age = 10)
    val mary = UserDataClass(name = "Mary", age = 22)
    val john = UserDataClass(name = "John", age = 10)

    println(jose == mary)
    println(jose == jose)
    println(jose == john)

    // copy
    val copyMary = mary.copy(age= 25)
    println(copyMary)
}