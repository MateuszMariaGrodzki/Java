package generictype;

public class Mage implements Hero {
    String name;

    public Mage(String name){
        this.name = name;
    }

    @Override
    public void attack(){
        System.out.println("Mage " + name + " attack");
    }

    @Override
    public void defend(){
        System.out.println("Mage " + name + "defend");
    }
}
