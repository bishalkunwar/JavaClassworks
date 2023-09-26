// Author: Bishal290, Date: 23rd Sept 2o23.

package week3;

import java.util.Scanner;

public class Exercise7_290 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Tables of Multiplications \n");

            for(int x = 2; x <= 10;x++){
                System.out.printf("Table of %d \n", x);
                for(int y = 1; y <=10; y++){
                    int product  = x*y;
                    System.out.printf("%d * %d == %d \n", x,y,product);
                }
                System.out.println();
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
