package algorithms.basic_maths;

public class One_Count_Digits {
    public static void main(String[] args) {
        int n =7789;
        int count=0;

        while (n !=0 ){
            count++;
            n = n/10;

        }


        System.out.println(count);
    }
}
