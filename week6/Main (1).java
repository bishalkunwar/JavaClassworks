import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nMax = 10;
        System.out.println("Enter the size of the Vectors, good size is between 1 and 10; ");
        int vSize = scanner.nextInt();

        if(vSize >= 1 && vSize <= 10){
            int[] vector1 = new int[vSize];
            int[] vector2  = new int[vSize];
            int dotProduct = 0;

            for(int i =0; i <vSize; i++){
                System.out.printf("Enter the value for vector1[%d]:- ", i+1);
                vector1[i] = scanner.nextInt();

                System.out.printf("Enter the value for vector2[%d]:- ", i+1);
                vector2[i] = scanner.nextInt();
                dotProduct += (vector1[i]*vector2[i]);
            }
            System.out.println(dotProduct);
        }else{
            System.out.println("Vector Size out of the bound or beyond size limit.");
        }
    }
}