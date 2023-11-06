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

    @Test
    void passwordGreater7_whenPasswordLengthIs5_thenReturnFalse() {
        // GIVEN
        String password = "mouse";
        // WHEN
        boolean actual = PasswordValidation.passwordGreater7(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void containNumbers_whenPosition3OfPasswordIsANumber_thenReturnTrue() {
        // GIVEN
        String password = "sj2riugu7fd";
        // WHEN
        boolean actual = PasswordValidation.containNumbers(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    void containNumbers_whenPasswordContainsNoNumber_thenReturnFalse() {
        // GIVEN
        String password = "sjriuggufgrd";
        // WHEN
        boolean actual = PasswordValidation.containNumbers(password);
        // THEN
        assertFalse(actual);
    }


}