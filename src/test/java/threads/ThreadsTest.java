package threads;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class ThreadsTest {

    Main main;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void init(){
        main = new Main();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @DisplayName("withSynchronizedTest")
    public void withSynchronizedTest() throws InterruptedException{
        MyThread r = new MyThread("Wątek", new SynchronizedIncrement());
        main.startThreadsMethod(r);
        assertEquals("Wątek zsynchronizowany:30000" , outContent.toString().trim());
    }

    @Test
    @DisplayName("withoutSynchronizedTest")
    public void withoutSynchronizedTest() throws InterruptedException{
        MyThread r = new MyThread("Wątek", new Increment());
        main.startThreadsMethod(r);

    }
}
