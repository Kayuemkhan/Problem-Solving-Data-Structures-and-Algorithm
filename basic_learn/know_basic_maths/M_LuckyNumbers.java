package basic_learn.know_basic_maths;

import java.util.Scanner;
public class M_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean foundLuckyNumber  = false;

        for (int i = n; i <=m ; i++) {
            int a =i;
            boolean flag = false;

            while (a>0){
                int x = a%10;
                if (x != 4 && x != 7 ){
                    flag = true;
                    break;
                }
                a /=10;
            }
            if(!flag ){
                System.out.print(i+" ");
                foundLuckyNumber  = true;
            }
        }
        if(!foundLuckyNumber ){
            System.out.println("-1");
        }

    }
}
