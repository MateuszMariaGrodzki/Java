package threads;

public class MyThread implements Runnable {
    String threadName;
    Increment increment;

    public MyThread(String threadName){
        this.threadName = threadName;
        increment = new Increment();
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
