package innerclasses;

public class OuterClass {

    private int a = 5;
    int b = 7;
    private static int c = 10;
    static int d = 13;

    void print(){
        InnerClass ie = new InnerClass();
        // zmienne prywatne z klasy wewnetrznej są dostepne w klasie zewnetrznej
        System.out.println(ie.e);
    }
        class InnerClass {
        private int e = 103;
        //private static int f = 200; - niestatyczne klasy wewnetrzne nie moga mieć statycznych niefinalnych zmiennych
        private static final int g = 200;
        //Dostęp do wszystkich pol klasy zewnętrznej
        public void print(){
            System.out.println(a);
            System.out.println(b);
            System.out.println(OuterClass.c);
            System.out.println(OuterClass.d);
        }
    }
        static class SecondInnerClass {
        int e = 103;
        static int f = 200; // statyczna zmienna została dopuszczona w statycznej klasie wewnetrznej
        static final int g = 200;

    }


}
