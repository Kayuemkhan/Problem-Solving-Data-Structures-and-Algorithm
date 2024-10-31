package algorithms.dataStructures.recursion;
/*

Tail recursion is defined as a recursive function in which the recursive call is the last statement that is executed by the function. So basically nothing is left to execute
after the recursion call.

 */
public class TailRecursionPrintOneToN {
    public static void main(String[] args) {
         int n =5;
         print(n);
    }
    static void print(int n)
    {
        if (n < 0)
            return;

        System.out.print(" " + n);

        // The last executed statement
        // is recursive call
        print(n - 1);
    }
}
