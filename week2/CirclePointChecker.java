import java.util.Scanner;

public class CirclePointChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user for the coordinates of the circle's origin
        System.out.print("Please provide the x-coordinate of the circle's origin: ");
        double centerX = scanner.nextDouble();
        
        System.out.print("Please PRovide the y-coordinate of the circle's origin: ");
        double centerY = scanner.nextDouble();
        
        // radious
        System.out.print("Please provide the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // coordinates of the point to check
        System.out.print("Please provide the x-coordinate of the point: ");
        double pointX = scanner.nextDouble();
        
        System.out.print("Please provide the y-coordinate of the point: ");
        double pointY = scanner.nextDouble();
        
        // Calculating the distance between circle's origin and the point
        double distance = Math.sqrt(Math.pow(pointX - centerX, 2) + Math.pow(pointY - centerY, 2));

        // conditional operator to check for the point is inside, on the edge, or outside the circle
        if (distance < radius) {
            System.out.println("After Calculation, The point is inside the circle.");
        } else if (distance == radius) {
            System.out.println("After Calculation, The point is on the edge of the circle.");
        } else {
            System.out.println("After Calculation, The point is outside the circle.");
        }

        // Close the Scanner
        scanner.close();
    }
}
