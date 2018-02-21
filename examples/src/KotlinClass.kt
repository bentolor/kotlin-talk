class KotlinClass(val javaclass: JavaClass) {
    fun callJavaClassMethod() {
        javaclass.printInJavaClass("Kotlin got: ${javaclass.valueFromJavaClass}" )
    }
}