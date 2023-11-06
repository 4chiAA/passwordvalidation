package bootcamp.neuefische;

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

    // Methode badPassword prüft, ob das Passwort zu üblich und zu einfach ist.
    // @param password
    // @return boolean true, wenn das Passwort nicht ein übliches Passwort ist


}
