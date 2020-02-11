package reflection;

public class HiddenClass {

    private String text = "Prywatne pole";

    private HiddenClass(String text){
        System.out.println("Ciało prywatnego konstruktora argumentowego");
        this.text = text;
    }

    private HiddenClass(){
        System.out.println("Ciało prywatnego konstruktora bezargumentowego");
    }

    private String getText(){
        return text;
    }
}
