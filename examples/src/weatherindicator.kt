class WeatherIndicatorKt {
    fun rateWeather(celsius: Int) {
        val (status, color) =
            when {
                celsius < 5 -> "Saukalt!" to Color.BLUE
                celsius in 5..20 ->  "Geht so!" to Color.ORANGE
                else -> "Urlaub!" to Color.RED
            }
    }

    enum class Color { BLUE, ORANGE, RED }
}

