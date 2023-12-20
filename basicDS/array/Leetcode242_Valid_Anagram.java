package basicDS.array;

import java.util.Arrays;

public class Leetcode242_Valid_Anagram {
    public static void main(String[] args) {
        String  s = "rat", t = "car";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String sortStr1 = new String(chars);

        char[] chars2 = t.toCharArray();
        Arrays.sort(chars2);
        String sortStr2 = new String(chars2);



        return sortStr1.equals(sortStr2);
    }
}
