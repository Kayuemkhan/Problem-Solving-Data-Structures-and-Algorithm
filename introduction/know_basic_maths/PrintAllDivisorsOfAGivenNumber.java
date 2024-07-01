package introduction.know_basic_maths;

import java.util.Scanner;

public class PrintAllDivisorsOfAGivenNumber {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDivisorsBruteForce(n);
    }

    static void printDivisorsBruteForce(int n){
        for(int i = 1; i <= n; i++)
            if(n % i == 0)
                System.out.println(i);

    }
}
