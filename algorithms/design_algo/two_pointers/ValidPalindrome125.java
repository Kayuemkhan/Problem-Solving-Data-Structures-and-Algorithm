package algorithms.design_algo.two_pointers;
import java.util.regex.Pattern;

public class ValidPalindrome125 {

        public static void main(String[] args) {
            String s = "race a car";
           
            String cleanedString = removeNonAlphanumeric(s);
            cleanedString = cleanedString.toLowerCase();

            int i=0,j=cleanedString.length()-1;

            for (int l = 0; l < cleanedString.length()/2; l++) {


                if(cleanedString.charAt(i)  !=  cleanedString.charAt(j) ){
                    System.out.println(false);
                    return;
                }
                else {
                    i++;
                    j--;
                }

            }
            System.out.println("true");
        }
        public static String removeNonAlphanumeric(String input) {
            // Regular expression to match non-alphanumeric characters
            String regex = "[^a-zA-Z0-9]";

            // Replace non-alphanumeric characters with empty string
            return input.replaceAll(regex, "");
        }

}
