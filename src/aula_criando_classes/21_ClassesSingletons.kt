package aula_criando_classes

// é um padrão de projeto que garante uma única instancia pra o projeto
// permite o uso global da instancia

object DatabaseUtil {
    private val url: String = "jbdc:mySql//localhost:8080/mydb"
    val user: String = "admin"
    val password: String = "admin"

    fun connect() {
        println("Connecting with database ... $url | user $user | password $password")
    }
}

// possui as mesmas caractericas do data class
// irei usar quando necessitar do uso específico de determinado dados
data object  DatabaseObjectUtil {

}

fun main() {
    DatabaseUtil.connect()

    println(DatabaseUtil)
    println(DatabaseObjectUtil)
}