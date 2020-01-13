package threads;

public class MyThread implements Runnable {
    private String threadName;
    private Increment increment;

    public MyThread(String threadName){
        this.threadName = threadName;
        this.increment = new Increment();
    }

    public int getValueFromIncrement(){
        return increment.getI();
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; ++i)
        increment.increment();
    }
}
