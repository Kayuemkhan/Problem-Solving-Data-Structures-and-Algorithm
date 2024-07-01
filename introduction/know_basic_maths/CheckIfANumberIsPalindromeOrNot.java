package introduction.know_basic_maths;

import java.util.Scanner;

/***
 * Steps:
 * Modulas
 * Divide
 *
 */
public class CheckIfANumberIsPalindromeOrNot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mainNumber = n;
        int reverseNum = 0;
        while (true) {
            int digit = n % 10;
            reverseNum = reverseNum * 10 + digit;
            n = n / 10;
            if (n == 0)
                break;
        }

        if (reverseNum == mainNumber) {
            System.out.println(reverseNum);
            System.out.println("YES");
        } else {
            System.out.println(reverseNum);
            System.out.println("NO");
        }
    }
}
