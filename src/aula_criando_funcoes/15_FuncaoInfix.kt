package aula_criando_funcoes

infix fun Int.sum(num: Int): Int = this + num

class XY(val x: Int, val y: Int) {
    infix fun sum(xy: XY): XY {
        return XY(x = this.x + xy.x, y = this.y + xy.y)
    }
}

fun main() {
    // A funcao só aceita 1 parametro
    println(1 sum 2)

    val test = XY(x = 1, y =2) sum XY(x= 2, y =3)
    println(test.x)
}