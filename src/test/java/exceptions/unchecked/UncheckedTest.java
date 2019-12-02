package exceptions.unchecked;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UncheckedTest {
    Unchecked unchecked;

    @BeforeEach
    public void init(){
        unchecked = new Unchecked();
    }

    @Test
    @DisplayName("Testing divide method")
    public void testDivide(){
        assertEquals(4, unchecked.divide(16,4));
        assertEquals(3 , unchecked.divide(16,5));
        assertThrows(ArithmeticException.class, () -> unchecked.divide(1,0));
    }

    @Test
    @DisplayName("Testing element table method")
    public void testElementTableMethod(){
        assertFalse(unchecked.getElementFromTable(10,5));
        assertThrows(IndexOutOfBoundsException.class , () -> unchecked.getElementFromTable(5,-3));
        assertThrows(NegativeArraySizeException.class , () -> unchecked.getElementFromTable(-5,4));
    }
}
