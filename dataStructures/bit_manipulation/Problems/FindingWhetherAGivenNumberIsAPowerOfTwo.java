package dataStructures.bit_manipulation.Problems;

public class FindingWhetherAGivenNumberIsAPowerOfTwo {

    // Function to check if
    // x is power of 2
    static boolean isPowerOfTwo(int n)
    {
        if (n == 0)
            return false;

        while (n != 1) {
            if (n % 2 != 0)
                return false;
            n = n / 2;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {

        // Function call
        if (isPowerOfTwo(31))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(64))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
