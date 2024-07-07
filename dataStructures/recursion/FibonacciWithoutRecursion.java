package dataStructures.recursion;

public class FibonacciWithoutRecursion {
    public static void main(String[] args) {
        int a=0;
        int b =1;
        int n =5;
        int c =0;
        for (int i = 2; i < n; i++) {
            c = a+b;
            a =b;
            b =c;
        }

        System.out.println("nth Fibonacci = "+b);
    }
}
