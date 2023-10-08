package basic_learn.know_basic_maths;

import java.util.Scanner;

public class U_SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int num = i;
            int digitSum = 0;

            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            if (digitSum >= a && digitSum <= b) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}