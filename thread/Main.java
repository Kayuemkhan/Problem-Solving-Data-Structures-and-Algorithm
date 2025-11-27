package thread;

public class Main {
    public static void main(String[] args) {
       String s = "abbcccddddeeeeedcba";

        System.out.println(maxPower(s));
    }
    static int maxPower(String s) {
        int n = s.length();
        int maxCount = 0, count = 1;

        if (n == 0)
            return 0;



        for (int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                maxCount = Math.max(maxCount,count);
                count=1;
            }
        }

        return Math.max(maxCount,count);
    }
}
