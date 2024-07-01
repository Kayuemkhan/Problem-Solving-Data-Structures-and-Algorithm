package thread;

public class Main {
    public static void main(String[] args) {
        ExtendedThreadRunnable extendedThreadRunnable = new ExtendedThreadRunnable();

        Thread thread = new Thread(extendedThreadRunnable);
        thread.setName("New Thread");
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("[" +i +"] Inside "+ Thread.currentThread().getName() );
            sleepOneSecond();
        }
    }
    private static void sleepOneSecond() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
