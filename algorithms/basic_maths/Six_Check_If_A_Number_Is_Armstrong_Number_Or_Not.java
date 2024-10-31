package algorithms.basic_maths;

public class Six_Check_If_A_Number_Is_Armstrong_Number_Or_Not {
    public static void main(String[] args) {
        int num = 153;

        int tempNum = num;

        int count =0;


        while (num !=0 ){
            int lastDigit = num%10;
            count = lastDigit*lastDigit*lastDigit + count;
            num /= 10;
        }


        System.out.println(count == tempNum);

    }
}
