package reflection;

public class HiddenClass {

    private String text = "Prywatne pole";

    private HiddenClass(){
        System.out.println("Prywatny kosntruktor");
        text = "Zmiana prywatnego pola przez konstruktor";
    }

    private String getText(){
        return text;
    }
}
