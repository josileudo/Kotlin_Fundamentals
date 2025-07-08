package aula_29_generics

fun <T> printItem(item: T) {
    println(item)
}

data class Product(val name: String, val amount: Int)

class Container <T>(val items: List<T>): PrintItem<T> {
    fun showItems() {
        println(
            """
                items do container
                ${items.joinToString()}
            """.trimIndent()
        )
    }

    override fun printItem(item: T) {
        println("$item")
    }
}

interface PrintItem<T> {
    fun printItem(item: T)
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun <T: Comparable<T>> findMax(a: T, b: T): T {
    return if (a > b) a else b
}

fun main() {
    printItem(item = "Kotlin")
    printItem(item = true)

    val container1 = Container(
        items = listOf(
            Product(name = "Car", amount = 2),
            Product(name = "Computer", amount = 10)
        )
    )

    val container2 = Container(
        items = listOf("João", "Maria")
    )

    container1.showItems()
    container2.showItems()
    container2.printItem(item = container2.items.first())

    val peopleList = listOf("Joao", "Maria")
    val peopleList2 = listOf("Joao")

    println(peopleList.secondOrNull())
    println(peopleList2.secondOrNull())

    println(findMax(a = "Hello", b = "Kotlin"))
    println(findMax(a = 1, b = 2))
}