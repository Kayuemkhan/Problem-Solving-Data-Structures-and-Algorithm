package thread;

public class ExtendedThreadRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("[" +i +"] Inside "+ Thread.currentThread().getName() );
            sleepOneSecond();
        }
    }

    private void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
