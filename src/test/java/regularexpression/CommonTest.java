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

    @Test
    @DisplayName("Testing post code method")
    public void testPostCode(){
        assertAll(
                () -> assertTrue(common.isPostCodeCorrect("20-531")),
                () -> assertFalse(common.isPostCodeCorrect("223-51")),
                () -> assertFalse(common.isPostCodeCorrect("aa-aaa"))
        );
    }

    @Test
    @DisplayName("Testing password method")
    public void testPassword(){
        assertAll(
                () -> assertTrue(common.isPasswordCorrect("AlaMaKota123@")),
                () -> assertTrue(common.isPasswordCorrect("940kds32AA34*&")),
                () -> assertTrue(common.isPasswordCorrect("asd231AA321^-")),
                () -> assertFalse(common.isPasswordCorrect("aA1%")),
                () -> assertFalse(common.isPasswordCorrect("aA1%aaaaaaaaaaaaaaaaaaaaa")),
                () -> assertFalse(common.isPasswordCorrect("AlaMaKota123")),
                () -> assertFalse(common.isPasswordCorrect("alamakota123@")),
                () -> assertFalse(common.isPasswordCorrect("ALAMAKOTA123@")),
                () -> assertFalse(common.isPasswordCorrect("AlaMaKota@@@@"))
        );
    }
}
