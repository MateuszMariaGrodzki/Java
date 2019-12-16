package generictype;

public class Archer implements Hero {
    private String name;

    public Archer(String name){
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("Archer " + name + " attack");
    }

    @Override
    public void defend() {
        System.out.println("Archer " + name + " defend");
    }

    @Override
    public String toString() {
        return "I'm archer";
    }
}
