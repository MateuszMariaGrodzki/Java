package generictype;

public class Mission<T extends Hero> {
    private T hero;

    public Mission(T hero){
        this.hero = hero;
    }

    public void introduce(){
        System.out.println(hero.toString());
    }

    public T getHero(){
        return hero;
    }
}
