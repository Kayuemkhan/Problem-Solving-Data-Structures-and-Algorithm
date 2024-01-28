package oj_solve.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

class Solution3 {

    public static void main(String[] args) {
        String s = "()";
        Stack<String> parenthesis = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            parenthesis.push(String.valueOf(s.charAt(i)));
        }



    }
}