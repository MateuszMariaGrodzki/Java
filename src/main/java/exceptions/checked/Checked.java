package exceptions.checked;
import java.io.*;

public class Checked {
    // dziedzicza po exception ale nie po runtimeexception
    // odpowiedzialnosc za ich obsluzenie spada na programistę
    // brak obsługi wyjątku typu checked zostanie wykryte przez kompilator
    // FileNotFoundException , IOException , ClassNotFoundException , SQLException


    public void printFileContent(String fileName) throws IOException {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());
    }
}
