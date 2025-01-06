package aula_08_nules

fun main() {
    // Handling
    var a: String?  = null

    // Elvis operator
    val result = a ?: "String value"

    println(result)

    var b: Int = -1
    b = a?.toInt() ?: 0
    println(b)

    // Safe casts
    var c = a as? Int
    println(c)

    // Let function
    b?.let {
        println(it)
    }
}