package aula_28_classes_seladas

// Objetivo é controlar a herança dentro da aplicação

sealed interface Animal {
    data class Dog(val bread: String): Animal {
        override fun sound(): String {
            return "Au!"
        }
    }
    data class Cat(val color: String): Animal {
        override fun sound(): String {
            return "Miau!"
        }
    }

    fun sound(): String
}

sealed class Result {
    data class Success(val data: String): Result() // Adiciona parentese para mostrar que esta sendo instanciado
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

fun handleAnimal(animal: Animal) {
    println(
        when(animal) {
            is Animal.Cat -> "O animal selecionado foi um gato de cor ${animal.color}. O som que ele faz é ${animal.sound()}"
            is Animal.Dog -> "O animal selecionado foi um cachorro da raça ${animal.bread}. O som que ele faz é ${animal.sound()}"
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

    val animalInserted: Animal = Animal.Cat(color = "Branco")

    handleResult(contacts)
    handleResult(isContactInserted)
    handleResult(isContactUpdated)

    handleAnimal(animalInserted)
}