package basic_learn.know_basic_maths;

/***
 Approach:
 Store the integer in a variable X and initialize a counter variable to count the number of digits.
 We know that in programming languages when we divide X by Y it will result in an integer (given both the variables are integers). For example,133/10 will result
 in 13 similarly 1/10 will result in 0.
 Using a for loop and above observation keep on dividing X by 10 and increment the count in every iteration when X equals 0 terminate the loop and the count will
 have the number of digits in N.
 */

public class CountDigitsInANumber {
    public static void main(String[] args) {
        int n = 123;
        int flag = 0;

        do {
            n = n / 10;
            flag++;
        } while (n != 0);
        System.out.println(flag);
    }
}
