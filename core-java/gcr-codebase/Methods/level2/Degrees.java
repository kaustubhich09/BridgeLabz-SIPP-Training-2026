public class Degrees {

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheit2celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return fahrenheit2celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsius2fahrenheit = (celsius * 9.0 / 5.0) + 32;
        return celsius2fahrenheit;
    }

    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {

        System.out.println("98.6°F = "
                + convertFahrenheitToCelsius(98.6) + "°C");

        System.out.println("37°C = "
                + convertCelsiusToFahrenheit(37) + "°F");

        System.out.println("150 Pounds = "
                + convertPoundsToKilograms(150) + " Kilograms");

        System.out.println("68 Kilograms = "
                + convertKilogramsToPounds(68) + " Pounds");

        System.out.println("5 Gallons = "
                + convertGallonsToLiters(5) + " Liters");

        System.out.println("10 Liters = "
                + convertLitersToGallons(10) + " Gallons");
    }
}

