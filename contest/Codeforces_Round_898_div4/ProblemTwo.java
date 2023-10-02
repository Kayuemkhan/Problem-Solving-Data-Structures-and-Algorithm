package contest.Codeforces_Round_898_div4;

import java.util.Arrays;
import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            int b = scanner.nextInt();
            int arr[] = new int[b];

            for (int j = 0; j < b; j++) {
                arr[j] = scanner.nextInt();
            }

            Arrays.sort(arr);
            arr[0]++;
            int sum=1;
            for (int j = 0; j < b; j++) {
                sum *= arr[j];
            }

            System.out.println(sum);
        }
    }
}
