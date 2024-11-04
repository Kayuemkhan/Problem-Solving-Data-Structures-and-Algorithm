package algorithms.dataStructures.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println( findNthFibonacci (4));;
    }

    private static int findNthFibonacci(int i) {
        if(i<2)
            return i;

        return findNthFibonacci(i-1) + findNthFibonacci(i-2);
    }
}
