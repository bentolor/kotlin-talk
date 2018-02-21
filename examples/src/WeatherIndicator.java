public class WeatherIndicator {
    void rateWeather(int celsius) {
        String status;
        Color color;
        if (celsius < 5) {
            status = "Saukalt!";
            color = Color.BLUE;
        } else if (celsius >= 5 && celsius <= 20) {
            status = "Geht so!";
            color = Color.ORANGE;
        } else {
            status = "Urlaub!";
            color = Color.RED;
        }
    }

    enum Color {BLUE, ORANGE, RED}
}

