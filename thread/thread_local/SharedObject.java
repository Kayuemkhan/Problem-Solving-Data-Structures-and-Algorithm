package thread.thread_local;

import java.util.concurrent.TimeUnit;

public class SharedObject {
    private ThreadLocal<Integer> number =
            new ThreadLocal<>();

    public Integer  getNumber(){
        return number.get();
    }

    public void setNumber(Integer number){
        this.number.set(number);
    }

    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        setARandomNumber(sharedObject);
    }

    private static void setARandomNumber(SharedObject sharedObject) {
        sharedObject.setNumber(
                (int) (Math.random() * 100)
        );

        try {
            TimeUnit.SECONDS.sleep(1);

        }catch (Exception e){
            Thread.currentThread().interrupt();
            throw new AssertionError(e);
        }
    }
}
