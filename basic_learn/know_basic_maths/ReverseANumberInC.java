package basic_learn.know_basic_maths;

/***
 * Steps:
 * Modulas
 * Divide
 */

public class ReverseANumberInC {
    public static void main(String[] args) {
            int n = 129;
            int reverseNum=0;
            while (true){
                int digit = n%10;
                reverseNum = reverseNum *10 + digit;
                n = n/10;
                if(n==0)
                    break;
            }
        System.out.println(reverseNum);
    }
}
