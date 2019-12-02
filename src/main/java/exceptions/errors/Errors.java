package exceptions.errors;

public class Errors {

    public int stackOverflowError(int t) {
        return t == 0 ? 0 : stackOverflowError(t++);
    }

    public void outOfMemoryError(){
        int[] table = new int[1000000000];
    }
}
