package exceptions.checked;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class CheckedTest {
    Checked checked;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void init(){
        checked = new Checked();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @DisplayName("Correct file name test")
    void correctNameTest() throws IOException{
        checked.printFileContent("aaa.txt");
        assertEquals("Hello" , outContent.toString().trim());
    }

}
