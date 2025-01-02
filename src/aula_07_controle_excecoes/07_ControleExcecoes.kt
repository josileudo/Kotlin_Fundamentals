package aula_07_controle_excecoes

import java.security.InvalidParameterException

fun main() {
    // try/catch

    var x = 10
    try {
        // Executado com sucesso
        x = 11
//        println(x)
        throw InvalidParameterException()
    } catch (e: ArithmeticException) {
        // Quando ocorrer uma exceção
        x = 12
        println(e.javaClass)
        println(e.message)
        println("Erro de expressão matemática")
    } catch(e: Exception) {
        x = 143
        println(e)
        println("Erro genérico")
    }
//    finally {
//        // Ocorre sempre ao final de ambas condições
//        x = 13
//        println(x)
//    }

}