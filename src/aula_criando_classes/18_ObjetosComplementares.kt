package aula_criando_classes

// companion é um objeto estático
class Person2 {
    companion object {
        const val key = "1234566"
        private const val key_2 = "7891011"
        fun getKey(): String = key_2
    }

}

fun main() {
    println(Person2.key)
    println(Person2.getKey())
}