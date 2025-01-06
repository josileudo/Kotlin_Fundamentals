package aula_10_colecoes

fun main() {
    val array1: Array<Int> = arrayOf(1,2,3,4,5)
    val array2: Array<String> = arrayOf("1", "2", "3", "4")

    println(array1.joinToString())
    println(array2.joinToString())

    println(array1.joinToString(prefix = "[", separator = "**", postfix = "]"))

    val array3: Array<Int> = arrayOf(6,7,8,9,10)

    val arrayConcat = array1 + array3

    println(arrayConcat.joinToString())

    // list
    // podem ser mutaveis ou imutaveis

    println("list")

    val list = listOf(1, 2, 3, "hi", 1..2, false, 10, 15, 20)
    val mutableList = mutableListOf(1, 2,3)

    mutableList.add(4)

    println(mutableList)

    val listInt: List<Int> = list.filterIsInstance<Int>()
    println(listInt)

    val listIntHigherThat2 = list.filter { it is Int && it > 2 }
    println(listIntHigherThat2)

    val listIntMessy = listOf(10, 40, 20, 35, 5, 45_610,)
    val listStringMessy = listOf("Banana", "Ameixa", "Manga", "Castanha")

    println(listIntMessy.sorted())
    println(listStringMessy.sorted())

    println(listIntMessy.reversed())
    println(listStringMessy.reversed())

    println(listIntMessy.max())
    println(listIntMessy.min())

    val findFirstOdd = list.find { it is Int && it % 2 != 0 }
    val findLastOdd = list.findLast { it is Int && it % 2 != 0 }
    println(findFirstOdd)
    println(findLastOdd)

    val booleanMapIntHigherThan10 = listIntMessy.map { "$it: ${it > 10}"  }
    println(booleanMapIntHigherThan10)
}