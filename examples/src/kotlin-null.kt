import kotlin.properties.Delegates

var nullable: String? = null

fun myStr1(): String {
    return nullable!!.toUpperCase()
}

fun myStr2(): String {
    return nullable?.toUpperCase() ?: ""
}

fun myStr3(): String {
    return nullable?.toUpperCase() ?: throw IllegalStateException("Nah!")
}

fun myStr4(): String {
    val s = nullable
    if (s != null) {
        return s.toUpperCase()
    } else {
        return ""
    }
}

fun myStr5(): String {
    return System.getenv("PWD")
}

fun main(args: Array<String>) {
    nullable = "foo"
    println(myStr1())
    println(myStr2())
    println(myStr3())
    println(myStr4())
    println(myStr5())
    with(AndroidView()) {
        onCreate()
        doView()
    }
}

class AndroidView {
    lateinit var nonNullable: String
    var otherNonNullable: String by Delegates.notNull()

    fun onCreate() {
        nonNullable = "Foo"
        otherNonNullable = "Bar"
    }

    fun doView() {
        println(nonNullable)
        println(otherNonNullable)
    }
}

