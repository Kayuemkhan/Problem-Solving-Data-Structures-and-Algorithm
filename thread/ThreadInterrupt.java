package thread;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class ThreadInterrupt implements Runnable {
    private final static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:s a");

    @Override
    public void run() {
        while (true) {
            if (Thread.interrupted()) {
                System.out.println("Thread is interrupt");
                return;
            }
            printCurrentTime();
            sleepOneSecondThread();

        }
    }

    private void sleepOneSecondThread() {
        try {
            Thread.sleep(TimeUnit.SECONDS.toMillis(1));
        } catch (InterruptedException ignored) {
        }
    }

    private void printCurrentTime() {
        String formattedCurrentTime = LocalDateTime.now().format(formatter);

        System.out.println(formattedCurrentTime);
    }
}
