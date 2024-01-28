package dataStructures.recursion;

public class Recursion {
    public static void main(String[] args) {
       String[] s = {"h","e","l","l","o"};

        printNToOne(s);
    }

    private static String[] printNToOne(String[] str) {
        int n = 5;
        int i=0;
        int j =str.length-1;

        if(i==j) return str;
        else {
            System.out.println(i);
        }
        return str;
    }
}
