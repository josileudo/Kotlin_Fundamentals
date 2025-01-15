package aula_criando_funcoes

fun sum(a: Int, b: Int): Int = a + b

fun multiply(a: Int, b: Int): Int = a * b

fun subtract(a: Int, b:Int): Int = a - b

fun mathOperation(a: Int, b: Int, operation: (Int, Int) -> Int ): Int {
    return operation(a, b)
}

fun main() {
    val divider = {a: Int, b: Int -> a / b}

    // Para funcoes declarativas precisamos da referencia ::
    println(mathOperation(a = 10, b = 15, operation = ::sum))
    println(mathOperation(a = 10, b = 15, operation = ::multiply))
    println(mathOperation(a = 10, b = 15, operation = ::subtract))

    // Para funcoes anonimas não é necessário
    println(mathOperation(a = 10, b = 15, operation = divider))

}