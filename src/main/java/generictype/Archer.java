package generictype;

public class Archer implements Hero {
    String name;

    public Archer(String name){
        this.name = name;
    }

    @Override
    public void atack() {
        System.out.println("Archer" + name + "attack");
    }

    @Override
    public void defend() {
        System.out.println("Archer" + name + "defend");
    }
}
