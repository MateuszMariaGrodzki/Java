package exceptions.checked;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked {
    // dziedzicza po exception ale nie po runtimeexception
    // odpowiedzialnosc za ich obsluzenie spada na programistę
    // brak obsługi wyjątku typu checked zostanie wykryte przez kompilator
    // FileNotFoundException , IOException , ClassNotFoundException , SQLException

    public static void printFileContent(String fileName){

        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
