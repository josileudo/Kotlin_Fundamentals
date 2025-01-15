package aula_criando_classes

class People(
    val name: String
) {
    var age: Int = 0
        set(value) {
            if (field <= 0) field = value
            else println("Valor desconhecido")
        }

    var height: Double = 0.0
        get() = Math.ceil(field)
}


fun main() {
    val john: People = People(name = "João")

    john.age = 25
    john.height = 178.0

    println(john.age)
    println(john.height)

    john.age = -10

    println(john.age)
}