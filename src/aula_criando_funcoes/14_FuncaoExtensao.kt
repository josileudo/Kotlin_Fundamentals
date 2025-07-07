package aula_criando_funcoes

fun String.isPalindrome(): Boolean {
    return this == this.reversed()
}

fun Double.format(decimalDigits: Int): String {
    return "%.${decimalDigits}f".format(this)
}

fun main() {
    println("radar".isPalindrome()) // true
    println("day".isPalindrome()) // false
    println(3.14159.format(2)) // 3.14
}
