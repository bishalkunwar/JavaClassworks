import java.util.Scanner;

// class Traingle to play with the 3 sides of a triangle.
class Triangle{
    private Point side1;
    private Point side2;
    private Point side3;

    // constructor method to initialise Triangle with its 3 sides
    public Triangle(Point side1, Point side2, Point side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    };

    // Method to calculate and return the Perimeter of a triangle.
    public double calculatePerimeter(){
        double sideA = side1.calculateDistance(side2);
        double sideB = side2.calculateDistance(side3);
        double sideC = side3.calculateDistance(side1);

        return sideA+sideB+sideC; // formula to calculate the perimeter of triangle is : sum of all sides.
    };

    // Method to check and return the boolean value if atleast two sides of the triangle are of equal value or not, isolate trianlge checker.
    public boolean checkIsolation(){
        double sideA = side1.calculateDistance(side2);
        double sideB = side2.calculateDistance(side3);
        double sideC = side3.calculateDistance(side1);

        // returns the boolean value either true or false
        return (sideA == sideB) || (sideA == sideB) ||(sideB == sideC);
    };
};

class Point{
    // double type variable declarations to the point class.
    private double x;
    private double y;

    // constructor method for double type variables: x and y
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Getter method for the x variable
    public double getX(){
        return x;
    }

    // Getter method for the y variable.
    public double getY(){
        return y;
    }

    // Method that returns the calculated distance between two points x and y.
    public double calculateDistance(Point z) {
        double point1 = x - z.getX();
        double point2 = y - z.getY();
        return Math.sqrt(point1*point1 + point2 * point2);
    }

}


public class GeometryProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int triangleNums;

        System.out.println("Please Provide the number of Triangles (Mandatory at least 3):- ");
        triangleNums = scanner.nextInt();

        // Array container to hold the triangle objects of user size.
        Triangle[] containers = new Triangle[triangleNums];

        // Condition check, if number of traingle is less than 3 then simply show the output to the user else proceed further.
        if (triangleNums < 3) {
            System.out.println("Sorry, the triangle's number must be greater than at least 3 ");
        } else {
            // for loop to take the user input co-ordinate x and co-ordinate y of 3 sides of a triangle and to append it to the array class Triangle.
            for (int i = 0; i < triangleNums; i++) {
                System.out.println("Please provide the vertices values for " + (i + 1) + " Triangle");
                System.out.println("Provide the x and y values of for Side 1");
                Point side1 = pointCreator(scanner);
                System.out.println("Provide the x and y values of for Side 2");
                Point side2 = pointCreator(scanner);
                System.out.println("Provide the x and y values of for Side 3");
                Point side3 = pointCreator(scanner);

                containers[i] = new Triangle(side1, side2, side3);
            }
            ;

            // calculate the perimeter of each triangle via the Triangle Class perimeterCalculated method. and also check if the triangle is isolated or not via the checkIsolation method.
            for (int i = 0; i < triangleNums; i++) {
                Triangle container = containers[i];

                System.out.println();
                double perimeterCalculated = container.calculatePerimeter();
                System.out.println("The Perimeter of Triangle " + (i + 1) + " is " + perimeterCalculated);

                if(container.checkIsolation()){
                    System.out.println("The Given Triangle is an isoceles Triangle.");
                }else {
                    System.out.println("The Given Triangle is not an isoceles Triangle.");
                }

                System.out.println("---------------------------------------------");
            }

        }
        scanner.close();
    }

    // Method to take the user input of x and y co-ordinates.
    private static Point pointCreator(Scanner scan) {
        System.out.print("Provide the X Co-Ordinate variable: ");
        double x = scan.nextDouble();
        System.out.print("Provide the Y Co-Ordinate variable: ");
        double y = scan.nextDouble();
        return new Point(x, y);
    }
}





