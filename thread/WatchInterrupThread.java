package thread;

public class WatchInterrupThread {
    public static void main(String[] args) throws InterruptedException {
        Thread watchThread = new Thread(new ThreadInterrupt());
        watchThread.start();

        Thread.sleep(500);
        watchThread.interrupt();
    }
}
