package aula_04_operadores_logicos

fun main() {
    val a = true
    val b = false
    val c = true

    // OPERADOR AND (&&)
    val result = a && b // false
    val result2 = a && c // true

    println("OPERADOR AND")
    println(result)
    println(result2)

    // OPERADOR OR (||)

    println("OPERADOR OR")
    val result3 = a || b
    val result4 = a || c
    println(result3)
    println(result4)

    // OPERADOR NO (!)
    println("OPERADOR NO")
    val e = true
    val f = !e
    println(f)

    // OPERADOR DE IGUALDADE (==)
    println("OPERADOR ==")
    println(a == c)

    // OPERADOR DE DESIGUALDADE (!=)
    println("OPERADOR DE DESIGUALDADE")
    println(a != c)

    // OPERADOR É DO TIPO e NÃO É DO TIPO (is e !is)

    println("operador é igual ou não ao tipo")
    val num: Any = 1
    val numText: Any = "1"
    println(num is Int)
    println(numText is String)
    println(numText is Int)

    // Operadores PERTENCE e NÃO PERTENCE (in e !in)
    val range = 1..10
    val x = 5
    val y = 15

    val world = listOf<String>("JESUS", "IS", "GOOD")
    println("operador PERTENCE")
    println(x in range)
    println(y in range)
    println("JESUS" in world)

    println("operador NÃO PERTENCE")
    println(x !in range)
    println(y !in range)
}