package generictype;

public class Main {

    public static void main(String[] args) {

        Mission mission = new Mission(new Knight("aaa"));
        mission.getHero().attack();
    }
}
