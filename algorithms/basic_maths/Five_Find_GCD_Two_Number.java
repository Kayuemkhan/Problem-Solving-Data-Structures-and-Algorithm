package algorithms.basic_maths;

public class Five_Find_GCD_Two_Number {
    public static void main(String[] args) {
        int n1 =20, n2=15;
        int n3 = Math.max(n1, n2);
        int divisor =0;
        for (int i = 1; i <= n3; i++) {
            if ((n1%i ==0) && (n2 % i ==0)){
                divisor = i;
            }
        }
        System.out.println(divisor);


    }
}
