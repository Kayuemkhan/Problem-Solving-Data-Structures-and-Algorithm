package algorithms.dataStructures.recursion;

public class Recursion {
    public static void main(String[] args) {
       int a =10;
       printNum(a);

    }

    private static int printNum(int a) {
        System.out.println(a);

        if(a<2)
            return a;
        else
            return printNum(a-1);
    }


}
