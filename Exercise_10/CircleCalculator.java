package Exercise_10;

import java.util.Scanner;

// Defining a Point class to represent a point with x and y coordinates.
class Point {
    // Constructors / properties for the x and y coordinates of a circle
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

// Circle class with private attributes for radius and center point.
class Circle {
    // properties of a circle
    private double radius;
    private Point center;

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    // Calculating to return the surface area of the circle by using the formula
    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean isInternal(double x, double y){
        // calculating the distance between the point and center of circle by the distance formula,
        double distance = formula. // pending here.

        return ...;
    }
}

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of at least three Circle objects
        System.out.println("Enter the number of circle to perform the desired calculation:- \n");
        int num = scanner.nextInt();
        Circle[] circles = new Circle[num];

        // Input circle data and populate the array
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Enter the radius of Circle " + (i + 1) + ":");
            double radius = scanner.nextDouble();

            System.out.println("Enter the x-coordinate of the center of Circle " + (i + 1) + ":");
            double centerX = scanner.nextDouble();

            System.out.println("Enter the y-coordinate of the center of Circle " + (i + 1) + ":");
            double centerY = scanner.nextDouble();

            Point center = new Point(centerX, centerY);
            circles[i] = new Circle(radius, center);
        }

        System.out.println("Enter x-coordinate from the point:");
        double x = scanner.nextDouble();

        System.out.println("Enter y-coordinate from the point:");
        double y = scanner.nextDouble();

        // Iterate through the array of circles and perform calculations.
        for(int i = 0; i < circles.length; i++){
            double circleSurface = circles[i].surface();
            boolean isInternalChecked = circles[i].isInternal(x,y);

            System.out.println("Circle " + (i + 1) + " Surface: " + circleSurface);
            System.out.println("Point (" + x + ", " + y + ") is inside Circle " + (i + 1) + ": " + isInternalChecked);
        }
    }
}
