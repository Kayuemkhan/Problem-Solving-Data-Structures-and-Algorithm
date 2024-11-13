package oj_solve.leetcode;

public class Pow_X_N_50 {

    public static double myPow(double x, int n) {
        if (n == 0) return 1.0;

        long exp = Math.abs((long) n);
        double result = 1.0;

        while (exp > 0) {
            if ((exp % 2) == 1) {
                result *= x;
            }
            x *= x;
            exp /= 2;
        }

        return n < 0 ? 1.0 / result : result;
    }

    public static void main(String[] args) {
        double x = 34.00515;
        int n = -3;

        int sqrt = (int) Math.sqrt(8);
        System.out.println(sqrt);

//        System.out.println(countPow(x,n));
        System.out.println(myPow(x, n));
    }

    private static double countPow(double x, int n) {
        if (n < 2)
            return x;
        else
            return countPow(x + x, n - 1);
    }
}
