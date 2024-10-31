package algorithms.basic_maths;

public class Two_Extract_Digits_From_A_Given_Number {
    public static void main(String[] args) {
        int n =12345;
        int[] arr = new int[5];
        int count=0;

        while (n !=0 ){
            arr[count] = n%10;
            n = n/10;
            count++;
        }

        for (int j : arr) {
            System.out.println(j);
        }



    }
}
