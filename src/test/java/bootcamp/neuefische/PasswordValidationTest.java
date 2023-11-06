package bootcamp.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationTest {

    @Test
    void passwordGreater7_whenPasswordLengthIs8_thenReturnTrue() {
        // GIVEN
        String password = "housecat";
        // WHEN
        boolean actual = PasswordValidation.passwordGreater7(password);
        // THEN
        assertTrue(actual);
    }



}