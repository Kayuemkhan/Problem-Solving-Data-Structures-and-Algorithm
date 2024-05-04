package thread.waiting_for_finalization;

import java.util.concurrent.TimeUnit;

public class Example1Modified {
    private static boolean doneWorking = false;

    public static void main(String[] args) {
        Thread t1 = new Thread(
                ()->{
                    findTheTop20Fibonacci();
                    doneWorking = true;
                }
        );
        t1.start();


        try {
            // Without sleeping  used join. because,we don't know how minutes we need to sleep.
            t1.join();
            if(doneWorking)
                System.out.println("\n Thread t1 has finished  the  work!");
            else
                System.out.println("\n Thread t1 didn't finish the work!");

        } catch (InterruptedException e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }

    private static void findTheTop20Fibonacci() {
        for (int value = 1; value < 20; value++) {
            System.out.println(fib(value) + "");
        }
    }

    private static int fib(int value) {
        if(value == 1||  value ==2 )
            return 1;
        else
            return fib(value-1) +fib(value-2);
    }
}
