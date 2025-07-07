package aula_criando_classes

enum class Direction(val description: String) {
    NORTH(description = "Direção norte") { // 0
        override fun symbol(): Char {
            return '↑'
        }

        override val symbol: Char
            get() = '↑'
    },
    SOUTH(description = "Direção sul") { // 1
        override fun symbol(): Char {
            return '↓'
        }

        override val symbol: Char
            get() = '↓'
    },
    EAST(description = "Direção leste") {  // 2
        override fun symbol(): Char {
            return '→'
        }

        override val symbol: Char
            get() = '→'
    },
    WEST(description = "Direção oeste") {   // 3
        override fun symbol(): Char {
            return '←'
        }

        override val symbol: Char
            get() = '←'
    };

    companion object {
        fun sumDirection(firstDirection: Direction, secondDirection: Direction ) {
            println(firstDirection.description)
            println(secondDirection.description)
        }
    }

    fun addDirection(direction: Direction) {
        println(this.description)
        println(direction.description)
    }

    abstract fun symbol(): Char
    abstract val symbol: Char
}

fun main() {
    val north = Direction.NORTH

    println(north.ordinal) // 0
    println(north.name) // NORTH
    println(north.description) // "Direção norte"

    Direction.SOUTH.addDirection(direction = Direction.EAST)
    Direction.sumDirection(firstDirection = north, secondDirection = Direction.WEST)

    // Entries -> são todos os itens completos das direções
    println("*** Entries ***")
    Direction.entries.forEach { item ->
        println(item.symbol() + " | " + item.symbol)
    }

    // ValueOf
    println("*** ValueOf ***")
    println(Direction.valueOf("SOUTH").ordinal)
    println(Direction.valueOf("NORTH").symbol())

}