package basic_learn.know_basic_maths;

/***
 * Armstrong Numbers are the numbers having the sum of digits raised to power no. of digits is equal to a given number.
 * Examples- 0, 1, 153, 370, 371, 407, and 1634 are some Armstrong Numbers.
 */

public class CheckIfANumberIsArmstrongNumberOrNot {
    static boolean ArmstrongNumber(int n) {
        int originalno = n;
        int count = 0;
        int temp = n;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }
        int sumofpower = 0;
        while (n != 0) {
            int digit = n % 10;
            sumofpower += Math.pow(digit, count);
            n /= 10;
        }
        return (sumofpower == originalno);
    }

    public static void main(String args[]) {
        int n1 = 153;
        if (ArmstrongNumber(n1)) {
            System.out.println("Yes, it is an Armstrong Number\n");
        } else {
            System.out.println("No, it is not an Armstrong Number\n");
        }

    }
}
