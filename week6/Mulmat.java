import java.util.Scanner;

public class Mulmat{


    public static int getInput(String msg){
        Scanner scanner = new Scanner(System.in);

        System.out.print(msg);
        int input = scanner.nextInt();

        return  input;
    }

    public static void fillMatrix(double [][] matrix){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i <matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++ ){
                System.out.printf("M[%d][%d] = ", i+1,j+1);
                matrix[i][j] =scanner.nextDouble();
            }
        }
    }

    public static void productCalculate(double[][] matrix1, double[][] matrix2, double[][] product){
        for(int i= 0; i<matrix1.length;i++){
            for(int j=0; j<matrix2[i].length;j++){
                for(int k = 0; k< matrix2.length; k++){
                    product[i][j] = matrix1[i][k]*matrix2[k][j];
                };
            };
        };

    }

    public static void main(String[] args){

        int row1 = getInput("Enter the size of row of Matrix 1: ");
        int column1 = getInput("Enter the size of column of Matrix 1: ");
        int row2 = getInput("Enter the size of row of Matrix 2: ");
        int column2 = getInput("Enter the size of column of Matrix 2: ");

        double [][] mat1 = new double[row1][column1];
        double [][] mat2 = new double[row2][column2];

        if(row1 != column2) {
            System.out.println("Sorry the matrix multipy cannot occour with these rows and columns");
        }else{
            fillMatrix(mat1);
            fillMatrix(mat2);

            double [][] productMatrix = new double[row1][column2];
            productCalculate(mat1,mat2,productMatrix);

            System.out.println("Product Matrix is:- ");
            for(int i = 0; i< row1; i++){
                for(int j = 0; j< column2; j++){
                    System.out.print(productMatrix[i][j]+"\t");
                }
                System.out.println();
            };

        }

    }
}