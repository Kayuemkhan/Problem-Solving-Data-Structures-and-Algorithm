package algorithms.dataStructures.recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n =10;
        int count =0;
        countSumOfDigits(count,n);
    }

    private static void countSumOfDigits(int count, int n) {
        if ( n<= 0)
            System.out.println(count);
        else{
            count++;
            countSumOfDigits(count, n/10);
        }
    }
}
