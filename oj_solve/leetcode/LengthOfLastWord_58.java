package oj_solve.leetcode;

public class LengthOfLastWord_58 {
    public static void main(String[] args) {
        String s = "Hello World";
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(i);
            if (String.valueOf(s.charAt(i)).equals(" ")) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}
