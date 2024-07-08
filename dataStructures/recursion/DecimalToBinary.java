package dataStructures.recursion;

public class DecimalToBinary {

    // Function to convert decimal to binary using recursion
    public static String decimalToBinary(int n) {
        // Base case
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        }

        // Recursive case
        return decimalToBinary(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int decimalNumber = 19; // Example decimal number
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryNumber);
    }
}