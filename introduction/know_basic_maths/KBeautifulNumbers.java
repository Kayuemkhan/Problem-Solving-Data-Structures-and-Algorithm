package introduction.know_basic_maths;

import java.util.Scanner;

public class KBeautifulNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();

        for (int i = 0; i < testCase; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();

            int y = findKBeautifulNumber(first, second);
            System.out.println(y);
        }
    }

    public static int findKBeautifulNumber(int x, int k) {
        while (true) {
            int sum = 0;
            int num = x;

            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }

            if (sum % k == 0) {
                return x;
            }

            x++;
        }
    }
}