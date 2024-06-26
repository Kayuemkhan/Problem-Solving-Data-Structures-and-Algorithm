package thread.scheduling;

public class PriorityDemo {

    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println(
                    Thread.currentThread().getName() +
                    " started with priority " + Thread.currentThread().getPriority()
            );
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(Thread.currentThread().getName() + " finished");
        };

        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(task, "Thread-" + i);
            threads[i].setPriority(i + 1);
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
