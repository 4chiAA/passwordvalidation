package bootcamp.neuefische;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {

    // Methode passwordGreater7 stellt sicher, dass das Passwort mindestens 8 Zeichen lang ist.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 8 Zeichen hat
    public static boolean passwordGreater7(String password) {
        return password.length() > 7;
    }


    // Methode containNumbers prüft, ob das Passwort Ziffern enthält.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 1 Ziffer
    public static boolean containNumbers(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }


    // Methode lowerAndUpperCaseLetters stellt sicher, dass Groß- und auch Kleinbuchstaben verwendet werden.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 1 Groß- und auch Kleinbuchstaben enthält
    public static boolean lowerAndUpperCaseLetters(String password) {
        boolean lowerCase = false;
        boolean upperCase = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase = true;
            }
            if (Character.isUpperCase(password.charAt(i))) {
                upperCase = true;
            }
        }
        return lowerCase && upperCase;
    }


    // Methode noCommonPassword prüft, ob das Passwort zu üblich und zu einfach ist.
    // @param password
    // @return boolean true, wenn das Passwort nicht ein übliches Passwort ist
    public static boolean noCommonPassword(String password) {
        String[] commonPassword = {"Aa345678", "Password123", "12345678", "Password1", "12Password", "MyPassword"};
        for (String i : commonPassword) {
            if (password.contains(i)) {
                return false;
            }
        }
        return true;
    }


    // Methode specialCharacter prüft, ob das Passwort zu üblich und zu einfach ist.
    // @param password
    // @return boolean true, wenn das Passwort nicht ein übliches Passwort ist
    public static boolean specialCharacter(String password) {
        // Creating regex pattern by creating object of Pattern class
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        // Creating matcher for above pattern on our string
        Matcher m = p.matcher(password);
        // Now finding the matches imposing find() method
        return m.find();
    }


    // Methode isSafe prüft, ob alle Vorgaben die oben gemacht wurden zutreffen..
    // @param password
    // @return boolean true, wenn alle Vorgaben stimmen
    public static boolean isSafe(String password) {
        return passwordGreater7(password) && containNumbers(password) &&
                lowerAndUpperCaseLetters(password) && noCommonPassword(password) &&
                specialCharacter(password);
    }

}



