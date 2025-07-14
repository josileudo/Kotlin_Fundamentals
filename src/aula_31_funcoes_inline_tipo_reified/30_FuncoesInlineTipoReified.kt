package aula_31_funcoes_inline_tipo_reified

import aula_30_variancia.Drink
import javax.sql.rowset.Joinable

// Aumenta desempenho, evita sobrecarga de chamada ha funcoes
// Faz com que seja reduzida para funcoes lambidas

inline fun executeAction(action1: () -> Unit, action2: () -> Unit, action3: () -> Unit ) {
    println("Iniciando a acao...")
    action1()
    action2()
    action3()
    println("Finalizando a acao.")
}

inline fun <reified T> printTypeName() {
    println(T::class.simpleName)
}

open class Drink(val name: String)

class Juice: Drink(name = "Suco")
class Soda: Drink(name = "Refrigerante")
class Coffee: Drink(name = "Café")

class Cup<out T : Drink>(val drink: T, val amount: Int)

inline fun <reified T : Drink> serveDrink(cup: Cup<T>) {
    println("[${T::class.simpleName}] Servindo a bebida ${cup.drink.name} de quantidade ${cup.amount} ml")
}

fun main() {
    printTypeName<String>()
    printTypeName<Int>()

    val juice = Juice()
    val juiceCup = Cup(drink = juice, amount = 2)

    serveDrink(juiceCup)
}