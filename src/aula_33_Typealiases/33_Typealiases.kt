package aula_33_Typealiases

typealias Operation = (Int, Int) -> Int

fun mainOperation(a: Int, b: Int, operation: Operation): Int {
    return operation(a, b)
}

typealias NomeEstudante = String
typealias NotaEstudante = List<Int>
typealias MapaEstudantes = Map<NomeEstudante, NotaEstudante>

fun processoNotas(mapaEstudantes: MapaEstudantes) {
    for((nome, notas) in mapaEstudantes) {
        println("Estudante $nome | Notas: $notas")
    }
}

fun main() {
    val estudantes: MapaEstudantes = mapOf(
        "Aline" to listOf(1, 2, 3),
        "Jose" to listOf(10, 6, 8)
    )

    processoNotas(mapaEstudantes = estudantes)
}