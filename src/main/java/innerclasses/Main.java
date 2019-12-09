package innerclasses;

public class Main {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.print(); // wyswietlenie zmiennej prywatnej klasy wewnetrznej
        //tworzenie obiektu klasy wewnetrznej odbywa sie za pomoca klasy zewnetrznej
        // klasa niestatyczna
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.print();
        //klasy statyczne
        System.out.println(OuterClass.SecondInnerClass.f);
        //utworzenie obiektu wewnetrznej klasy statycznej
        OuterClass.SecondInnerClass secondInnerClass = new OuterClass.SecondInnerClass();
        System.out.println(secondInnerClass.e);
    }
}
