import java.util.Scanner;

public class TemperatureConverter {

    // Method to get the user's choice with validation
    public static int getUserChoice(Scanner scanner) {
        int choice = 0;
        while (true) {
            System.out.print("Enter your choice (1, 2, or 3 to Exit): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                if (choice == 1 || choice == 2 || choice == 3) {
                    break;
                } else {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
        return choice;
    }

    // Method to get the temperature value with validation
    public static double getTemperatureValue(Scanner scanner) {
        double temperature = 0;
        while (true) {
            System.out.print("Enter the temperature value: ");
            if (scanner.hasNextDouble()) {
                temperature = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid temperature.");
                scanner.next(); // Clear the invalid input
            }
        }
        return temperature;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu
            System.out.println("\nTemperature Converter");
            System.out.println("Choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit");
            System.out.println("2. Convert Fahrenheit to Celsius");
            System.out.println("3. Exit");

            // Get user's choice
            int choice = getUserChoice(scanner);

            // Exit if the user chooses option 3
            if (choice == 3) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            // Get the temperature value
            double temperature = getTemperatureValue(scanner);

            // Perform conversion based on user's choice
            if (choice == 1) {
                double fahrenheit = convertCelsiusToFahrenheit(temperature);
                System.out.printf("%.2f Celsius is %.2f Fahrenheit.%n", temperature, fahrenheit);
            } else {
                double celsius = convertFahrenheitToCelsius(temperature);
                System.out.printf("%.2f Fahrenheit is %.2f Celsius.%n", temperature, celsius);
            }
        }

        // Close the scanner
        scanner.close();
    }
}
