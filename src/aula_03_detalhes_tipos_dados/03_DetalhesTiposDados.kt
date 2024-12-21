package aula_03_detalhes_tipos_dados

fun main() {
    val age: Int = 25

    // Adicionar meses em formato decimal ao inteiro de idade (Converter idade em um tipo de dado numérico flutuante)

    var ageDouble: Double = age.toDouble()

    val monthPercent: Double = 1.0 / 12

    println("ageDouble = $ageDouble, monthPercent = $monthPercent")

    // 2 meses depois ...

    ageDouble += 2 * monthPercent

    println("ageDouble updated = $ageDouble")

    // Mostrar idade em formato de string com a string padrão "A idade é x anos"
    val ageText = "A idade é ${ageDouble.toString().plus(" anos")}"

    println(ageText)

    // Em letra maiúscula

    println(ageText.uppercase())
}
