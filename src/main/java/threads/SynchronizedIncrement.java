package threads;

public class SynchronizedIncrement implements IncrementInterface {
    private int i;

    public synchronized void increment(){
        i++;
    }

    public int getI(){
        return i;
    }

    @Override
    public void introduce() {
        System.out.println("Wątek zsynchronizowany");
    }
}
