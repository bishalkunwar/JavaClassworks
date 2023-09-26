// Author: Bishal290, Date: 23rd Sept 2o23.

package week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_290 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Checking the number if it is in union range or no.");
        
        try {
            System.out.println("Enter a real number:- ");
            double x = sc.nextDouble(); 

            // result string stores the 
            String result = ((x >= 2 && x < 3) || (x > 0 && x <= 1) || (x >= -10 && x <= -2)) ? "Belongs to I" : "Does not belong to I";
            System.out.printf("%.2f "+result, x);   
        } catch (InputMismatchException e) {
            System.out.println(e);
        }

    }
    
}




// Correct logic but code is   quite dirty and difficult to read.

//  try {
//             System.out.println("Checking the number if it is in union range or no.");



//             System.out.println("Enter a real number:- ");
//             double x = sc.nextDouble(); 

//             String check = "";

//             if((x >= 2 && x < 3) || (x > 0 && x <= 1) || (x >= -10 && x <= -2)){
//                 check = "belongs to range i";
//             }else{
//                 check = "Does not belong to range i";
//             }

//         System.out.printf("%.2f "+check, x);

//         } catch (InputMismatchException ex) {
//             System.out.printf("Error: ", ex);
//         }