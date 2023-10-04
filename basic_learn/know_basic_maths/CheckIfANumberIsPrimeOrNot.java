package basic_learn.know_basic_maths;

import java.util.Scanner;

public class CheckIfANumberIsPrimeOrNot {
    public static boolean isPrime(int N) {

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int n =1;
        while (inputNum >1){
            n++;
            inputNum--;
            boolean ans = (isPrime(n));
            if (ans) {
                System.out.print(n + " ");
            }
        }

    }
}
