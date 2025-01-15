package aula_criando_classes

// Dentro de classes aninhadas não se pode usar variáveis de escopo

class Car(val name: String, val age: Int) {
    class Engine {
        class Fuel(val typeName: String) {
            fun fuelCar() {
                println("Abastecendo ...")
            }
        }

        fun start() {
            println("Ligando ...")
        }
    }
}

// podemos usar o data
data class Car2(var name: String, var age: Int) {
    object  Engine {
        data class Fuel(var typeName: String) {
            fun fuelCar() {
                println("Abastecendo ...")
            }
        }

        fun start() {
            println("Ligando ...")
        }
    }
}

fun main() {
    var car = Car(name = "Civic", age = 2020)
    var carEngine = Car.Engine()
    var carFuelType = Car.Engine.Fuel(typeName = "Gasolina")

    //
    var car2 = Car2(name = "Civic", age = 2020)
    var carEngine2 = Car2.Engine
    var carFuelType2 = Car2.Engine.Fuel(typeName = "Gasolina")
}