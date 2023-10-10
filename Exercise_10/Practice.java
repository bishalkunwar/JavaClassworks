//  In this example, I'll create a simple "Shape" hierarchy with different types of shapes, each demonstrating these OOP concepts.

package Exercise_10;

// Abstraction: Creating an abstract base class "Shape" that defines common properties and methods for all shapes.
abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area(); // Abstract method to calculate the area of a shape.

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Polymorphism: A method to display information about a shape.
    public void displayInfo() {
        System.out.println("Shape: " + getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Area: " + area());
    }
}

// Inheritance: Creating specific shape classes (Rectangle and Circle) that inherit from the base class "Shape."
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Practice {
    public static void main(String[] args) {
        // Encapsulation: Creating objects and using setter and getter methods to access and modify attributes.
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        Circle circle = new Circle("Red", 4.0);

        System.out.println("Original Rectangle Color: " + rectangle.getColor());
        rectangle.setColor("Green");
        System.out.println("Modified Rectangle Color: " + rectangle.getColor());

        System.out.println("Original Circle Color: " + circle.getColor());
        circle.setColor("Yellow");
        System.out.println("Modified Circle Color: " + circle.getColor());

        // Polymorphism: Calling the displayInfo method on different shapes.
        rectangle.displayInfo();
        System.out.println("-------------");
        circle.displayInfo();
    }
}


public class Practice{

    public static 
}

