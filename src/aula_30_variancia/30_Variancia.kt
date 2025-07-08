package aula_30_variancia

// alt => Variancia
// in => Co Variancia

open class Animal(val name: String)

class Dog: Animal(name = "Cachorro")
class Cat: Animal(name = "Gato")
class bird: Animal(name = "Pássaro")


// Contravariancia  = in (Consumidores)
class Feeder<in T: Animal> {
    fun feed(animal: T) {
        println("${animal.name} foi alimentado")
    }
}

// Covariancia = alt (Produtores)
open class Drink(val name: String)

class Juice: Drink(name = "Suco")
class Soda: Drink(name = "Refrigerante")
class Coffee: Drink(name = "Café")

class Cup<out T : Drink>(val drink: T, val amount: Int)

fun serveDrink(cup: Cup<Drink>) {
    println("Servindo a bebida ${cup.drink.name} de quantidade ${cup.amount} ml")
}

fun main() {
    Feeder<Cat>().feed(animal = Cat())
    serveDrink(cup = Cup<Coffee>(drink = Coffee(), amount = 100))
}