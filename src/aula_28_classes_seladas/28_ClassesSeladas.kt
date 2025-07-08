package aula_28_classes_seladas

import javax.xml.crypto.Data

// Objetivo é controlar a herança dentro da aplicação

sealed class Result {
    data class Success(val data: String): Result()
    data class Error(val exception: Exception): Result()
    data object Loading: Result()
}

fun handleResult(result: Result) {
    println(
        when(result) {
            is Result.Error -> "Houve um erro! ${result.exception.message}"
            Result.Loading -> "Carregando..."
            is Result.Success -> "Sucesso: ${result.data}"
        }
    )
}

// Simulação de um BD
object Database {
    fun getContacts(): Result {
        return Result.Success(data = listOf("João", "Maria", "José").joinToString())
    }

    fun insertContact(contact: String): Result {
        return Result.Error(IllegalArgumentException("O contato a ser inserido possui caracteres inválidos"))
    }

    fun newContact(id: Int, newContact: String): Result {
        return Result.Loading
    }
}

fun main() {
    val contacts: Result = Database.getContacts()
    val isContactInserted: Result = Database.insertContact(contact = "Fernando")
    val isContactUpdated: Result = Database.newContact(id = 1, newContact = "Luiz Marcelo")

    handleResult(contacts)
    handleResult(isContactInserted)
    handleResult(isContactUpdated)
}