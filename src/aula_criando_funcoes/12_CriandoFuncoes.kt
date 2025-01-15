package aula_criando_funcoes

fun isEven(num: Int) {
    println("O número $num é par? ${num % 2 == 0}")
}

fun main () {
    var num = 4
    isEven(num = num)

    // Funções anônimas
    val funSum = {a: Int, b: Int -> a + b}
    println(funSum(2, 2))

    val funSum2 = {a: Int, b: Int -> {
        num = 100 // Não trabalha como mutabilidade
        a + b
    }}
    println(funSum2(2, 2).invoke()) // o metodo invoke retorna o resultado que está dentro da funcao
}

