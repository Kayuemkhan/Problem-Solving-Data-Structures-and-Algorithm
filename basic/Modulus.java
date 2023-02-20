package basic;

import java.util.ArrayList;
import java.util.List;

public class Modulus {
    public static void main(String[] args) {
        long x = 1;
        int n=5;
        int m=2;
        for (int i = 2; i <= n; i++) { x = (x*i)%m; }
        System.out.println(x%m);

        List<Integer> list = new ArrayList<>();


        System.out.println(list.stream());

    }
}
