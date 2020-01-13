package threads;

public class MyThread implements Runnable {
    private String threadName;
    private IncrementInterface incrementInterface;

    public MyThread(String threadName, IncrementInterface incrementInterface){
        this.threadName = threadName;
        this.incrementInterface = incrementInterface;
    }

    public int getValueFromIncrement(){
        return incrementInterface.getI();
    }

    public IncrementInterface getIncrementInterface(){
        return incrementInterface;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < 10000 ; ++i)
        incrementInterface.increment();
    }
}
