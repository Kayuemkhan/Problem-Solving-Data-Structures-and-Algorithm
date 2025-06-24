package introduction.know_basic_maths;

import java.util.Scanner;

/**
 * CheckIfANumberIsPalindromeOrNot
 * --------------------------------
 * This program checks whether a given integer is a palindrome or not.
 * A number is said to be a palindrome if it reads the same backward as forward.
 *
 * Core Concepts Used:
 * - Modulus operator to extract digits
 * - Integer division to reduce the number
 * - Looping and arithmetic logic to reverse the number
 *
 * Example:
 * --------
 * Input: 121
 * Reversed: 121
 * Output:
 * 121
 * YES
 *
 * Input: 123
 * Reversed: 321
 * Output:
 * 321
 * NO
 *
 * How it works:
 * -------------
 * 1. Read input number from user.
 * 2. Reverse the number using modulus (%) and division (/).
 * 3. Compare the reversed number with the original.
 * 4. Print the reversed number and "YES" if it's a palindrome, otherwise "NO".
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
