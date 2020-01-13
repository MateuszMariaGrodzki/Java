package threads;

public class Main {

    public static void main(String[] args)  {
        try {
            new Main().withoutSynchronized();
            new Main().withSynchronized();
        } catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

    public void withoutSynchronized() throws InterruptedException{
        MyThread r = new MyThread("Wątek", new Increment());
        startThreadsMethod(r);
    }

    public void withSynchronized() throws InterruptedException {
        MyThread r = new MyThread("Wątek", new SynchronizedIncrement());
        startThreadsMethod(r);
    }

    public void startThreadsMethod(MyThread myThread) throws InterruptedException{
        myThread.getIncrementInterface().introduce();
        Thread thread1 = new Thread(myThread);
        Thread thread2 = new Thread(myThread);
        Thread thread3 = new Thread(myThread);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(myThread.getValueFromIncrement());
    }
}
