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

    @Test
    void lowerAndUpperCaseLetters_whenPasswordIsAllLowerCase_thenReturnFalse() {
        // GIVEN
        String password = "sjriuggufgrd";
        // WHEN
        boolean actual = PasswordValidation.lowerAndUpperCaseLetters(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void lowerAndUpperCaseLetters_whenPasswordIsAllUpperCase_thenReturnFalse() {
        // GIVEN
        String password = "JSHDZFGDJSDKH";
        // WHEN
        boolean actual = PasswordValidation.lowerAndUpperCaseLetters(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void lowerAndUpperCaseLetters_whenPasswordHasBoth_thenReturnTrue() {
        // GIVEN
        String password = "sjriuSDggSDWgrd";
        // WHEN
        boolean actual = PasswordValidation.lowerAndUpperCaseLetters(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    void noCommonPassword_whenPasswordIsCommon_thenReturnFalse() {
        // GIVEN
        String password = "Password123";
        // WHEN
        boolean actual = PasswordValidation.noCommonPassword(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void noCommonPassword_whenPasswordIsNotCommon_thenReturnTrue() {
        // GIVEN
        String password = "f34gd5435wef";
        // WHEN
        boolean actual = PasswordValidation.noCommonPassword(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    void specialCharacter_whenPasswordContains$_thenReturnTrue() {
        // GIVEN
        String password = "dfgre$gsgfg";
        // WHEN
        boolean actual = PasswordValidation.specialCharacter(password);
        // THEN
        assertTrue(actual);
    }

    @Test
    void specialCharacter_whenPasswordContainsNoSpecialCharacter_thenReturnFalse() {
        // GIVEN
        String password = "dfgre456gsgfg";
        // WHEN
        boolean actual = PasswordValidation.specialCharacter(password);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isSafe_whenPasswordContainsAllRequirements_thenReturnTrue() {
        // GIVEN
        String password = "dgG/e456gsgfg";
        // WHEN
        boolean actual = PasswordValidation.isSafe(password);
        // THEN
        assertTrue(actual);
    }
}