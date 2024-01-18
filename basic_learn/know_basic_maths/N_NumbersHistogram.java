package basic_learn.know_basic_maths;

import java.util.Scanner;

public class N_NumbersHistogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nums[i]; j++) {
                System.out.print(s);
            }
            System.out.println();
        }

    }
}
