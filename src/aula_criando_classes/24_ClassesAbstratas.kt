package aula_criando_classes

// pode construir contratos para subclasses que herdam de uma class

abstract class Vehicle() {
    abstract val maxSpeed: Int
    abstract val wheelsAmount: Int

    abstract fun startMovement()

    fun info() {
        println("""
        Velocidade máxima = $maxSpeed km/h
        Quantidade de rodas = $wheelsAmount pneus
        """.trimIndent()
        )
    }
}

class Bike(color: String) : Vehicle() {
    override val maxSpeed: Int
        get() = 30
    override val wheelsAmount: Int
        get() = 2

    override fun startMovement() {
        println("Bike starting ...")
    }

}

class Car4(var model: String, var year: Int, var color: String) : Vehicle() {
    override val maxSpeed: Int
        get() = 180
    override val wheelsAmount: Int
        get() = 4

    override fun startMovement() {
        println("Car starting ...")
    }

    override fun toString(): String {
        super.info()
        return "Carro de modelo $model, cor $color, ano $year"
    }

}

fun main() {
    val car = Car4(
        model = "civic",
        year = 2012,
        color = "black"
    )

    val bike = Bike(
        color = "green"
    )

    println(car.toString())
    bike.info()
}