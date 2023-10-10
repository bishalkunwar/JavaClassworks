 
import java.util.InputMismatchException;
import java.util.Scanner;

public class PGDC{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        try {
            System.out.println("Enter the first positive number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second positive number: ");
            int num2 = sc.nextInt();

            int[] values = {1,2,3,4,5};

            int result = largestCommonDivisor(num1, num2);
            System.out.printf("The largest common divisor of %d and %d is %d", num1, num2, result);

            int greater = greaterValue(values);
            System.out.printf("%d is the greater of all", greater);

            int less = lowerValue(values);
            System.out.printf("%d is the greater of all", less);
        } catch (InputMismatchException e) {
            // TODO: handle exception
            System.out.println(e);
        }

    };

    public static int largestCommonDivisor(int num1, int num2){
            while(num1 != num2){
                if(num1>num2){
                    num1 = num1 - num2;
                }
                else{
                    num2 = num2 - num1;
                }
            }

            return num1;
    }

    public static int greaterValue(int[] array){
        int num = array[0];
        for(int x = 0; x <= array.length; x++){
            if(array[x] > num){
                num = array[x];
            };
        };
        return num;
    };

    public static int lowerValue(int[] array){
        int num = array[0];
        for(int x = 0; x <= array.length; x++){
            if(array[x] < num){
                num = array[x];
            };
        };
        return num;
    };


}

