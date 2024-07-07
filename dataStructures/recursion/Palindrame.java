package dataStructures.recursion;

public class Palindrame {
    public static void main(String[] args) {
        String input = "kayak";

        if (input.equals(checkPalindrame(input))){
            System.out.println("Palindrame");
        }
        else {
            System.out.println("Nooooooooooo");
        }
        System.out.println(checkPalindrame(input));
    }

    private static String checkPalindrame(String str) {
        System.out.println(str);
        if(str.isEmpty()){
            return  "";
        }
        return checkPalindrame(str.substring(1)) + str.charAt(0);

    }
}
