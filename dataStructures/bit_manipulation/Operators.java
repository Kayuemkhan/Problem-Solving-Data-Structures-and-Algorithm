package dataStructures.bit_manipulation;

public class Operators {
    public static void main(String[] args)
    {
//        // Initial values
//        int a = 5;
//        int b = 7;
//
//        // bitwise and
//        // 0101 & 0111=0101 = 5
//        System.out.println("a&b = " + (a & b));
//
//        // bitwise or
//        // 0101 | 0111=0111 = 7
//        System.out.println("a|b = " + (a | b));
//
//        // bitwise xor
//        // 0101 ^ 0111=0010 = 2
//        System.out.println("a^b = " + (a ^ b));
//
//        // bitwise not
//        // ~00000000 00000000 00000000 00000101=11111111 11111111 11111111 11111010
//        // will give 2's complement (32 bit) of 5 = -6
//        System.out.println("~a = " + ~a);
//
//        // can also be combined with
//        // assignment operator to provide shorthand
//        // assignment
//        // a=a&b
//        a &= b;
//        System.out.println("a= " + a);
//        System.out.println();
//
//        System.out.println("Auxiliary space:O(1)");
//
//        System.out.println("Time complexity:O(1)");

        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        long num1 = Long.parseLong(a,2);
        long num2 = Long.parseLong(b,2);

        long sum = num1 + num2;

        System.out.println(Long.toBinaryString(sum));
    }
}
