package regularexpression;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommonTest {

    Common common;

    @BeforeEach
    public void init(){
        common = new Common();
    }

    @Test
    @DisplayName("Testing email method")
    public void testEmail(){
        assertAll(
                () -> assertTrue(common.isEmailCorrect("mateusz.maria.grodzki@gmail.com")),
                () -> assertTrue(common.isEmailCorrect("test@test.pl")),
                () -> assertFalse(common.isEmailCorrect("_test@test.pl")),
                () -> assertFalse(common.isEmailCorrect("548mati@gmail.com")),
                () -> assertFalse(common.isEmailCorrect("agni.asdz@gmail"))
        );
    }
}
