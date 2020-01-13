package threads;

public class Increment implements IncrementInterface {
    private int i;

    public void increment(){
        i++;
    }

    public int getI(){
        return i;
    }

    @Override
    public void introduce() {
        System.out.print("Wątek niezsynchronizowany:");
    }
}
