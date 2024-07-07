package dataStructures.recursion;

public class PrintNToOne {
    public static void main(String[] args) {
        int n = 5;
        solve(n);

    }

    private static void solve(int n) {
        if(n == 1){
            System.out.println(1);
            return;
        }
        solve(n-1);
        System.out.println(n);

    }
}

