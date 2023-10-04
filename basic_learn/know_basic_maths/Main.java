package basic_learn.know_basic_maths;

import java.util.Scanner;

/***
 * the numbers are divisble by both number.
 * Most common divisiors
 * So we need to run loop through 1 to num1, num2
 * we find min number of both number.
 */

public class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);


    int num1 = scanner.nextInt(), num2 = scanner.nextInt();
    int ans = 1;
    for (int i = 1; i <= Math.min(num1, num2); i++) {
      if (num1 % i == 0 && num2 % i == 0) {
        ans = i;
      }
    }
    System.out.println(ans);
  }
}