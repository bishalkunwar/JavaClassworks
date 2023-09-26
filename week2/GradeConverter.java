import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a numeric grade
        System.out.print("Please provide the numeric grade attempted: ");
        
        // Reading the input numeric grade
        int gradeNum = scanner.nextInt();

        // Converting the numeric grade to letter grade and GPA
        String actualGrade;
        double gpa;

        if (gradeNum >= 90) {
            actualGrade = "A+";
            gpa = 4.0;
        } else if (gradeNum >= 80) {
            actualGrade = "A";
            gpa = 3.0;
        } else if (gradeNum >= 70) {
            actualGrade = "B";
            gpa = 2.0;
        } else if (gradeNum >= 60) {
            actualGrade = "C";
            gpa = 1.0;
        } else {
            actualGrade = "D";
            gpa = 0.0;
        }

        // Display the letter grade and GPA
        System.out.println("Letter Grade: " + actualGrade);
        System.out.println("GPA: " + gpa);

        // Close the Scanner
        scanner.close();
    }
}
