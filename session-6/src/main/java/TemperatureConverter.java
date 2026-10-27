public class TemperatureConverter {

            public static double celsiusToFahrenheit(double c) {
                return (c * 1.8) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
}