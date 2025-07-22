package aula_34_validacoes_de_argumento

// Require
fun dividir(a: Int, b: Int): Int {
    require( b != 0) { "O divizor não pode ser igual a zero." } // IllegalArgumentException
    return a / b
}

// requireNotNull
fun imprimirNome(nome: String?) {
    val nomeNaoNulo = requireNotNull(nome) {"Nome do usuario nao foi passado corretamente."}//IllegalArgumentException
    println(nomeNaoNulo)
}

// check
fun processarListaNotas(lista: List<Int>) {
    check(lista.isNotEmpty()) { "A lista está vazia. Portanto, não pode ser processada" } // IllegalStateException
    println("Processando lista de tamanho ${lista.size}")
    check(lista.all { it != 0 }) {"O aluno foi reprovado por ter tirado nota 0."}
    println("A media é ${lista.sum() / lista.size}")
}

fun main() {
//    println(dividir(a = 1, b =2))
//    println(dividir(a = 2,b = 0))

//    imprimirNome(nome = "Josileudo")
//    imprimirNome(null)

    processarListaNotas(lista = listOf(10, 5, 6, 5))
}