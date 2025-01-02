package aula_06_operadores_condicionais

fun main() {
    val x = 100
    val y = 10

    println("++ if/else ++")
    // 1 maneira
    if(x > y) {
        println("x > y")
    } else if( x < y) {
        println("x < y")
    } else if(x == y) {
        println("x == y")
    } else {
        println("else")
    }

    // 2 maneira => No kotlin podemos adicionar logicas dentro de uma variável
    val result = if(x > y) {
        "x > y"
    } else if(x < y) {
        "x < y"
    } else if(x == y) {
        "x == y"
    } else {
        "else"
    }


    println(result)

    //  when simplifica estruturas com muitas condições

    val result2 = when (x) {
        in 1..101 -> "1..100"
        100 -> "100"
        in 101..199 -> "101..199"
        else -> "else"
    }

    println("++ when ++")
    println(result2)

}