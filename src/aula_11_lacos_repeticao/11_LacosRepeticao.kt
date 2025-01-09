package aula_11_lacos_repeticao

fun main() {
    val list = listOf(1,2,"arroz",4)

    for (item in list) {
        println(item)
    }

    list.forEach {
        println(it)
    }

    list.forEachIndexed { index, item ->
        println("index: $index | item: $item")
    }

    for((index, item) in list.withIndex()) {
        println("index: $index | item: $item")
    }

    // while
    var index = 1
    var maxLimit = 5

    while (index <= maxLimit) {
        println("$index ...")
        index ++
    }

    // do / while
    var index2 = 1
    do {
        println(index2)
        index2 ++

    // podemos usar o break
    if(index2 == 3)
        break

    } while (index2 <= 5)

    // LACOS ANINHADOS
    loop@ for (i in 1..3) {
        for(j in 1 ..3 ) {
            if(i == 2 && j == 2 )
                break@loop

            println("i= $i | j= $j")
        }
    }

    // repeat
    var index3 = 1

    repeat(5) {
        index3 ++
        println(index3)
    }
}