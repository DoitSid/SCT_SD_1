//package ST_SD.src;
import java.util.Scanner;

public class emperatureConverter {
    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to convert Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Fahrenheit to Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    // Function to convert Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Function to convert Kelvin to Fahrenheit
    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvin - 273.15) * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Temperature Converter!");
        System.out.println("Select the scale you want to convert FROM:");
        System.out.println("1. Celsius\n2. Fahrenheit\n3. Kelvin");
        int choice = scanner.nextInt();

        System.out.println("Enter the temperature value: ");
        double inputTemperature = scanner.nextDouble();

        switch (choice) {
            case 1: // Celsius
                System.out.printf("Celsius to Fahrenheit: %.2f°F%n", celsiusToFahrenheit(inputTemperature));
                System.out.printf("Celsius to Kelvin: %.2fK%n", celsiusToKelvin(inputTemperature));
                break;

            case 2: // Fahrenheit
                System.out.printf("Fahrenheit to Celsius: %.2f°C%n", fahrenheitToCelsius(inputTemperature));
                System.out.printf("Fahrenheit to Kelvin: %.2fK%n", fahrenheitToKelvin(inputTemperature));
                break;

            case 3: // Kelvin
                System.out.printf("Kelvin to Celsius: %.2f°C%n", kelvinToCelsius(inputTemperature));
                System.out.printf("Kelvin to Fahrenheit: %.2f°F%n", kelvinToFahrenheit(inputTemperature));
                break;

            default:
                System.out.println("Invalid choice! Please restart and select a valid option.");
                break;
        }

        scanner.close();
        System.out.println("Thank you for using the Temperature Converter!");
    }
}
