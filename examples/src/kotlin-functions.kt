class FirstClassFunction(
        val f1: (String) -> Int,
        val f2: (Int) -> Boolean) {

    fun strToBool(str: String): Boolean {
        val f: (String) -> Boolean = higherOrderFun()
        return f(str)
    }

    private fun higherOrderFun(): (String) -> Boolean {
        return { x -> f2(f1(x)) }
    }
}

fun main(args: Array<String>) {
    val c = FirstClassFunction(Integer::parseInt, { it % 2 == 0 })
    val strings = listOf("2", "7", "8")
    println(strings.filter(c::strToBool)) // Kotlin 1.1+
}
