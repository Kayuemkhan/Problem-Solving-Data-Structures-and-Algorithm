package oj_solve.leetcode;

public class CountTheDigitsThatDivideANumber_2520 {
    public static void main(String[] args) {
        int n = 121;
        int mainValue =n;
        int count =0;
        while (n > 0){

            // get the last one

            int cal = n % 10;

            // check it is divided by the cal

            if(mainValue % cal ==0 )
                count++;
            // get the next Number
            n = n/10;
        }
        System.out.println(count);
    }
}
