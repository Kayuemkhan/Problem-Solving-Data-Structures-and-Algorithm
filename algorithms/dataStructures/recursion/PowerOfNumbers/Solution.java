package algorithms.dataStructures.recursion.PowerOfNumbers;

//public class Solution {
//    public static void main(String[] args) {
//        int n=2,r =2;
//        power(n,r);
//    }
//
//    private static long power(int n, int r) {
//
//
//        return 9;
//    }
//}

public class Solution {
    public static void main(String[] args) {
        print1(1);

    }

    private static void print1(int n) {
        System.out.println(n);
        print2(n+1);
    }

    private static void print2(int n) {
        System.out.println(n);
        print3(n+1);
    }

    private static void print3(int i) {
        System.out.println(i);
    }


}
