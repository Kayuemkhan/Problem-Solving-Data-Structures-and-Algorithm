package algorithms.dataStructures.recursion;

public class PrintReverseString {
    public static void main(String[] args) {
        char[] string = {'h','e','l','l','o'};
        reverseString(string);
    }

    private static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        System.out.println("s[r]");
        System.out.println(s[r]);
        System.out.println(s[r--]);

        while (l < r) {

            char temp = s[l];
            s[l++] = s[r];
            s[r--] = temp;

        }
    }
}
