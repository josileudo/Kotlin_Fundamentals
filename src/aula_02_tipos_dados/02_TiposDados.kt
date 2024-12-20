package aula_02_tipos_dados

fun main() {
    // TIPOS NUMÉRICOS INTEIROS
    val byte: Byte = 127
    val short: Short = 32_500
    val int: Int = 1_000_000
    val long: Long = 3102949588902029092

    // TIPOS NUMÉRICOS FLUTUANTES
    val float: Float = 3f
    val double: Double = 30.22

    // TIPOS DE TEXTOS
    val char: Char = 'a'
    val string: String = "Palavra"
    val string2: String = """
        lalsla
        lslala
        lalsala
        alals
    """.trimIndent()
    val string3: String = "${205} valores"

    // TIPOS BOOLEANOS
    val fal: Boolean = false
    val tru: Boolean = true
}