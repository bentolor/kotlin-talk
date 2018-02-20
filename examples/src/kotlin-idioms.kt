fun iterateListByIndex() {
    val list = listOf("a", "b", "c")
    for (index in list.indices) {
        println("$index -> ${list[index]}")
    }
}

fun repeatBlock() {
    println("I will not ...")
    repeat(3) { println("  ...repeat myself") }
}

fun main(args: Array<String>) {
    iterateListByIndex()
    repeatBlock()
}