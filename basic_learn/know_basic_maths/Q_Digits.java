package basic_learn.know_basic_maths;

import java.util.Scanner;

public class Q_Digits {
    public static void printDigitsFromRightToLeft(int n) {
        if (n == 0) {
            System.out.println("0");
            return;
        }

        int[] digits = new int[10];
        int count = 0;

        while (n > 0) {
            int digit = n % 10;
            digits[count] = digit;
            count++;
            n /= 10;
        }

        for (int i = 0; i < count; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int N = scanner.nextInt();
            printDigitsFromRightToLeft(N);
        }

        scanner.close();
    }
}
