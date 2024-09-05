package oj_solve.leetcode;

import java.util.Scanner;

class Solution3 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int num,sum =0;

        System.out.println("Enter Any Number : ");

        num = scanner.nextInt();
        while (num!=0){
            sum = sum * 10 + (num%10);
            num = num/ 10;
        }
        System.out.println(sum);
        System.out.println(num);

    }
}