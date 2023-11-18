import java.util.Scanner;

public class Frequency {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array1 = new int[size];

        for(int x = 0; x< size;x++){
            System.out.printf("Enter %d item:- ", x+1);
            array1[x] = sc.nextInt();
        };

        int count = 0;
        int maxRepeated  = array1[0];

        for (int i = 0; i < size; i++) {
            int itemCount =0;
            int maxRepeateditem = array1[i];
            for (int j = 0; j < size; j++) {
                if(maxRepeateditem == array1[j]){
                    itemCount++;
                }
                if(itemCount > count){
                    count = itemCount;
                    maxRepeated = maxRepeateditem;
                }
            }
        }

        System.out.print("The most frequent number in the table is: \n");
        System.out.printf("%d (%d x) ", maxRepeated, count);

    }
}