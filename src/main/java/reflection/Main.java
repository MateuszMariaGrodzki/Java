package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> clas = Class.forName("reflection.HiddenClass");
        // utworzenie konstruktora bezargumentowego
        Constructor constructor = clas.getDeclaredConstructor();
        // zmiana modyfikatora dostępu konstruktora
        constructor.setAccessible(true);
        Object object = constructor.newInstance();

        Method method = clas.getDeclaredMethod("getText");
        // zmiana modyfikatora dostępu metody
        method.setAccessible(true);
        System.out.println(method.invoke(object));

        // utworzenie konstruktora argumentowego
        Constructor secondConstructor = clas.getDeclaredConstructor(String.class);
        secondConstructor.setAccessible(true);
        // wywolanie konstruktora bezargumentowego wraz z zmiana pola text
        System.out.println(method.invoke(secondConstructor.newInstance("text jest teraz text")));

        Field field = clas.getDeclaredField("text");
        field.setAccessible(true);
        field.set(object,"kolejna zmiana pola text");
        System.out.println(method.invoke(object));
    }
}
