package generictype;

public class Knight implements Hero {
    String name;

    public Knight(String name){
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Knight " + name + " attack");
    }

    @Override
    public void defend() {
        System.out.println("Knight " + name + " defend");
    }
}
