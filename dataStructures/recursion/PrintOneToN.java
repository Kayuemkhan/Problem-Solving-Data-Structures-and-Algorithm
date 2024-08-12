package dataStructures.recursion;

public class PrintOneToN {
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

/*
    Visulization stacks:

    Stack Structure in Recursion
When the solve method is called with n = 5, the following sequence of calls and returns happens:

solve(5) is called.
solve(5) calls solve(4).
solve(4) calls solve(3).
solve(3) calls solve(2).
solve(2) calls solve(1).
solve(1) hits the base case, prints 1, and returns.
After solve(1) returns, the stack unwinds, and the following steps occur:

solve(2) prints 2 and returns.
solve(3) prints 3 and returns.
solve(4) prints 4 and returns.
solve(5) prints 5 and returns.
 */