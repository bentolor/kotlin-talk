class WeatherIndicatorKt {
    fun rateWeather(celsius: Int) {
        val (status, color) =
            when {
                celsius < 5 -> Pair("Saukalt!", Color.BLUE)
                celsius in 5..20 -> Pair("Geht so!", Color.ORANGE)
                else -> Pair("Urlaub!", Color.RED)
            }
    }

    enum class Color { BLUE, ORANGE, RED }
}

