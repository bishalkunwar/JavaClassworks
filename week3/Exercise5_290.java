// Author: Bishal290, Date: 23rd Sept 2o23.

package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * exercise5
 */
public class Exercise5_290 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("If Else Practices:");
        
        try {
            System.out.println("Enter a whole number:- ");
            int num = sc.nextInt();

            String oddEven = num%2==0?"Even":"Odd";
            String posNeg = num >= 0 ? "Positive":"Negative";
            
            System.out.println("The number is "+posNeg+" and is "+oddEven);   
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
}



// Dirty code eventhough logic is good.

        // // Boolean check = false;
        // String check  = "";

        // if(num %2 ==  0 ){
        //     result = "Even";
        //     if(num >= 0){
        //         check = "Positive";
        //     }else{
        //         check = "Negative";
        //     }
        // }else{
        //     result = "Odd";
        //     if(num >= 0){
        //         check = "Positive";
        //     }else{
        //         check = "Negative";
        //     }
        // }
