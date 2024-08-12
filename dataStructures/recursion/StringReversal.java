package dataStructures.recursion;

public class StringReversal {
    public static void main(String[] args) {
        String a = "This is a String";
        reverseString(a);
    }

    /*
    To solve this I should pay attention in two terms:
    1. What is the base case ( When Can I no longer Continue ) ?
    2. What is the smallest amount of work I can do in each Iteration ? ( Between each Invocation, what's the smallest "Unit" I can reverse )

    Answers:
    1. Only letter Exists / Empty String
    2. Pick a Single Character and continue
     */
    private static String reverseString(String str) {
        if (str.isEmpty()){
            return "";
        }

        return reverseString(str.substring(1)) + str.charAt(0);

    }
}
