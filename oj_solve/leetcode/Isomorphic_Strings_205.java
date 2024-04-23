package oj_solve.leetcode;

public class Isomorphic_Strings_205 {
    public static void main(String[] args) {
        String str1 = "abc";
        int str1ToInt = str1.hashCode();
        int str123ToInt = str1.hashCode();
        System.out.println(str123ToInt);

        String str2 = "abcd";
        int str2ToInt = str2.hashCode();
        System.out.println(str2ToInt);
    }
}
