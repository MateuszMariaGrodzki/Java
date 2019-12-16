package generictype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class HeroTest{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    Mission mission;

    @BeforeEach
    void init(){
        System.setOut(new PrintStream(outContent));
        mission = new Mission<Knight>(new Knight("aaa"));
    }

    @Test
    @DisplayName("Test for introducing knight")
    void introduceKnight(){
        mission.introduce();
        assertEquals("I'm knight" , outContent.toString().trim());
    }

    @Test
    @DisplayName("Test for knight attack")
    void testAttack(){
        mission.getHero().attack();
        assertEquals("Knight aaa attack" , outContent.toString().trim());
    }

    @Test
    @DisplayName("Test for knight to defend")
    void testDefent(){
        mission.getHero().defend();
        assertEquals("Knight aaa defend" , outContent.toString().trim());
    }

}
