package thread.deadlock;

public class CreateDeadLock {
    public static void main(String[] args)  {
        Thread t = Thread.currentThread();

        System.out.println(t.getState());
        System.out.println(t.getPriority());
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
        System.out.println(t.getThreadGroup());

        try {
            t.join();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
