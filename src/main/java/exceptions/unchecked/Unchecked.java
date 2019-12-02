package exceptions.unchecked;

public class Unchecked {
    //dziedziczą po runTimeException
    // zostaną wykryte dopiero podczas dzialania programu
    // NullPointerException , IndexOutOfBoundException

    public int divide(int a , int b){
        return a/b;
    }

    public boolean getElementFromTable(int tableSize , int elementIndex){
        boolean[] falseTable = new boolean[tableSize];
        return falseTable[elementIndex];
    }
}
