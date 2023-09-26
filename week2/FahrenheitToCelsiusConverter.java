import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please give the temperature in Fahrenheit: ");        
        
        // Temperature in Fahrenheit
        double fahrenheit = scanner.nextDouble();

        // Calculate the temperature in Celsius
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println("Calculated Temperature in Celcius: " + celsius);

        // Close the Scanner
        scanner.close();
    }
}