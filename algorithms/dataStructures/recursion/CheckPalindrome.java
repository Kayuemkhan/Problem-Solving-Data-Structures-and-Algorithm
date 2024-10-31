package algorithms.dataStructures.recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "kayak";

        if (checkPalindrome(input)){
            System.out.println("Palindrame");
        }
        else {
            System.out.println("Nooooooooooo");
        }
        System.out.println(checkPalindrome(input));
    }

    private static boolean checkPalindrome(String input) {
        if(input.length() ==0 ||input.length() == 1)
            return true;
        else if(input.charAt(0) == input.charAt(input.length()-1)){
            return checkPalindrome(input.substring(1, input.length()-1));
        }

        return false;
    }
}
