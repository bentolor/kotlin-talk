import java.util.*

fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Publikum"
    val zuschauer = Gast(name, title = Title.wertes)

    println(zuschauer)
    println("Hallo ${zuschauer.title} ${zuschauer.name}")
}

data class Gast(val name: String, var zeit: Date = Date(), val title: Title?)
enum class Title { Herr, Frau, wertes }

/*
- Top-Level functions
- Prägnanz: Kein Semikolon
- Kein`new`,
- `if` ist ein Ausdruck
- Properties
- `val` und `var`
 */