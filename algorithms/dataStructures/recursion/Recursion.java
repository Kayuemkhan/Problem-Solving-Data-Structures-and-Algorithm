package algorithms.dataStructures.recursion;

public class Recursion {
    public static void main(String[] args) {
       String[] s = {"h","e","l","l","o"};

        printNToOne(s);
    }

    private static void printNToOne(String[] str) {
        int n = 5;
        int i=0;
        int j =str.length-1;

        if(i != j) {
            printNToOne(str); ;
        }
        else {
            System.out.println(str[i]);
        }

        i++;

    }
}
