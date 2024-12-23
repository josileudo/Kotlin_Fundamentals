package aula_05_operadores_matematicos

import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.log10
import kotlin.math.pow

fun main() {
    val num1 = 4
    val num2 = 2

    println("básicos")
    println(num1 + num2)
    println(num1 - num2)
    println(num1 / num2)
    println(num1 * num2)
    println(num1 % num2)

    println("incremento")
    var num3 = 10
    var num4 = 5

    num3--
    num4++

    println(num3)
    println(num4)

    println("atribuicao composta")

    var num5 = 5

    println("// +=")
    num5 += num1
    println(num5)

    println("// -=")
    num5 -= num1
    println(num5)

    println("// /=")
    num5 /= num1
    println(num5)

    println("// *=")
    num5 *= num1
    println(num5)

    println("// %=")
    num5%=num1
    println(num5)

    // biblioteca math

    println("math")

    val value = 2.9
    val valueRounded = Math.round(value) // arredonda no 5
    println(valueRounded)

    val valueFloor = floor(value) // arredonda sempre para baixo
    println(valueFloor)

    val valueCeil = ceil(value) // arredondando para cima
    println(valueCeil)

    val base = 2.0
    val exponent = 3.0
    val valuePow = base.pow(exponent) // uso de valores exponenciais
    println(valuePow)

    val log = 1000.0
    val logValue = log10(log) // escala logarítimica
    println(logValue)
}