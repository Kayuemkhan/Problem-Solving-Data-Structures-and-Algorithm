/**
 * ValidAnagram
 * ------------
 * This program determines whether two strings are anagrams of each other.
 * Two strings are anagrams if they contain the same characters in the same frequencies,
 * but possibly in a different order.
 *
 * Key Idea:
 * - Use a HashMap to count occurrences of each character in the first string.
 * - Decrement counts based on characters in the second string.
 * - If counts mismatch or extra characters are found, the strings are not anagrams.
 *
 * Time Complexity: O(n), where n is the length of the strings.
 * Space Complexity: O(1), since the alphabet is limited (only lowercase English letters).
 *
 * Example:
 * --------
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 *
 * Input: s = "rat", t = "car"
 * Output: false
 *
 * Steps:
 * ------
 * 1. Check if lengths are different — if so, return false.
 * 2. Count character frequencies in the first string.
 * 3. Subtract frequencies using the second string.
 * 4. If any character count drops below zero or is missing, return false.
 * 5. If all checks pass, return true.
 */



package oj_solve.leetcode.blind75;

import java.util.HashMap;
import java.util.Map;



public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean checkAnagram = isAnagram(s, t);
        System.out.println(checkAnagram);
    }

    private static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);
        }

        return true;
    }

}
