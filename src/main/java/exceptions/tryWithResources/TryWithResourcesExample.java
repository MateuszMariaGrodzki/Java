package exceptions.tryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    // aby użyć instrukcji TWR muszę mieć klasę która
    // implementuje interfejs AutoCloseable
    // przykładem takiej klasy są BufferReader/Writer

    public void printLinesOfFile(String name){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(name))){
            String currentLine = bufferedReader.readLine();
            while(currentLine != null){
                System.out.println(currentLine);
                currentLine = bufferedReader.readLine();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
