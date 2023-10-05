package basic_learn.know_basic_maths;

import java.util.Scanner;

public class T_Shape2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of rows
        int N = scanner.nextInt();

        // Loop through each row
        for (int i = 1; i <= N; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }

            // Print asterisks for the pyramid
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        scanner.close();
    }
}