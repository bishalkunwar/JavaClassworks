import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        // Creating Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // ask user for radius of the circle
        System.out.print("Enter the radius of the circle: ");
        
        // Read the radius as a double
        double radius = scanner.nextDouble();

        // Area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Displaying the result
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}
