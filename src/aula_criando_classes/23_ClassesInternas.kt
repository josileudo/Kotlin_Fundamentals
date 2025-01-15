package aula_criando_classes

// Com as classes internas, eu consigo usar valores de escopo da funcao dentro de
// funcoes internas

class Car3(val name: String, val year: Int) {
    inner class Engine() {
        inner class Fuel(var typeFuel: String) {
            fun fuelType() {
                println("Abastecendo o carro $name do ano $year com $typeFuel")
                start()
            }
        }

        fun start () {
            println("Ligando $name do ano de $year...")
        }
    }
}

fun main() {
    val carEngine = Car3(name = "Cruze", year = 2014).Engine()
    carEngine.Fuel(typeFuel = "Gasosa").fuelType()
}