package aula_27_objetos_anonimos

interface ClickCallback {
    fun onClick()
}

fun main() {
    val x = 10

    // A funcao anonima é sempre um singleton, tem a capacidade implementar interfaces
    val objectTemp = object {
        val property1: Int = 1
        val property2: String = "Property 234"

        fun method1() {
            println(x)
        }
    }

    objectTemp.method1()

    val buttonClickCallback = object: ClickCallback {
        override fun onClick() {
            println("Botão clicado")
        }
    }

    buttonClickCallback.onClick()
}