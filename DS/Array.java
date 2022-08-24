package DS;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        // Creating an Array
        int arr[] = new int[10];

        // pushing new Items
        for(int i =0;i<5;i++){
            Scanner scanner  = new Scanner(System.in);
            arr[i] = scanner.nextInt();
        }

        // traversing an Array
        for(int i =0;i<5;i++){
            System.out.println(arr[i]);
        }

    }
}
