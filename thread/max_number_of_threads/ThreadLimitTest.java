package thread.max_number_of_threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.LockSupport;
public class ThreadLimitTest {
    public static void main(String[] args) {
        AtomicInteger threadCount = new AtomicInteger(0);
        try {
            while (threadCount.get() !=1000000) {
                Thread thread = new Thread(() -> {
                    threadCount.incrementAndGet();
                    LockSupport.park();
                });
                thread.start();
                System.out.println(threadCount.get());
            }
        } catch (OutOfMemoryError error) {
            System.out.println("Reached thread limit: " + threadCount);
            error.printStackTrace();
        }
    }
}