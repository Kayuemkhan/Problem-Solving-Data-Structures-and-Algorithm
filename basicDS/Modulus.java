package basicDS;

import java.util.Scanner;

public class Modulus {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int number;
        number = scnr.nextInt();
        System.out.println(isPrime(number));
    }
    public static String isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}