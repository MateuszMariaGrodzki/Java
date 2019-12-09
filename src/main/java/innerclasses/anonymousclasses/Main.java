package innerclasses.anonymousclasses;

public class Main {

    public static void main(String[] args) {
        AnonymousInteface anonymousInteface = new AnonymousInteface() {
            @Override
            public void print(String string) {
                System.out.println(string);
            }
        };
        anonymousInteface.print("aaa");
    }
}
