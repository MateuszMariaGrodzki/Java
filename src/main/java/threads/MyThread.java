package threads;

public class MyThread implements Runnable {
    String threadName;

    public MyThread(String threadName){
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Wątek " + threadName + " rozpoczyna dzialanie");

    }
}
