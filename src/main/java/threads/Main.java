package threads;

public class Main {

    public static void main(String[] args)  {
        try {
            new Main().withoutSynchronized();
        } catch ( InterruptedException e){
            e.printStackTrace();
        }
    }

    public void withoutSynchronized() throws InterruptedException{
        MyThread r = new MyThread("Wątek");

        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        Thread thread3 = new Thread(r);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println(r.getValueFromIncrement());
    }
}
