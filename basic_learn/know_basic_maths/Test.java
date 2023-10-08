package basic_learn.know_basic_maths;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int t = sc.nextInt();

        // Iterate through each test case
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            // Initialize the number of valid ways to zero
            int validWays = 0;

            // Unique elements before any modulo operation
            int uniqueElements = Math.min(n, m) + 1;  // +1 to include zero

            // If already too many unique elements
            if (k > uniqueElements) {
                System.out.println(0);
                continue;
            }

            // If k equals uniqueElements, then only one way to fill a_{n+1}
            if (k == uniqueElements) {
                System.out.println(1);
                continue;
            }

            // Calculation for k < uniqueElements
            if (k < uniqueElements) {
                // Loop from m down to m - (n - k), as these will yield k unique numbers after modulo operation
                for (int a_n1 = m; a_n1 >= m - (uniqueElements - k); a_n1--) {
                    validWays += 1;
                }
            }
            System.out.println(validWays);
        }

        sc.close();
    }
}