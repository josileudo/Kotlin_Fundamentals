package aula_10_colecoes

fun main() {
    // set
    val set = setOf(1,2,3,2)
    println(set)

    val setRandom = setOf(1, 2, 3, "kotlin", false, "kotlin2", 2, 1..2, 2.5, 5f)
    println(setRandom)

    val setMutable = mutableSetOf(1, 2, 3, 5, 3)
    setMutable.add(5)
    setMutable.remove(5)
    println(setMutable)

    // map
    val map = mapOf<Int, String>(Pair(1, "kotlin"), 1 to "Kotlin 1", 2 to "kotlin 2")

    println(map.keys)
    println(map.size)
    println(map.values)
    println(map.entries)

    val mapMutable = mutableMapOf(1 to "kotlin", "hi" to "petter", 1 to 1..10)
    println(mapMutable)

    for(i in 1..3) {
        println(i)
    }

    var soma = 0
    repeat(5) { i ->
        print(i)
        soma += i
    }
    println(soma)
}