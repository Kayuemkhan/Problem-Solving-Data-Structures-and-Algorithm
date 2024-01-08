package basic_learn.know_basic_maths;

import java.util.Scanner;

public class A_Almost_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum =0;

        for (int i = 1; i <= n; i++) {
            if( n % i == 0 ){
                if(isPrime(i)){
                    sum++;
                }
            }
        }
        System.out.println(sum);

    }
    public static boolean isPrime(int N) {

        if(N==1){
            return false;
        }

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;

    }
}
