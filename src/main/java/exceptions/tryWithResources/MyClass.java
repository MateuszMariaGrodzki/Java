package exceptions.tryWithResources;

public class MyClass implements AutoCloseable {

    public MyClass(){
        System.out.println("Utworzenie obiektu klasy " + MyClass.class.getName());
    }

    @Override
    public void close() throws Exception {
        System.out.println("Usuniecie obiektu");
    }

    public void exampleMethod(){
        try(MyClass myClass = new MyClass()){
            System.out.println("Obiekt \" zyje \" ");
        } catch(Exception e){
            e.printStackTrace();
        }
    }


}
