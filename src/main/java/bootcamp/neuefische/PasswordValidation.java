package bootcamp.neuefische;

public class PasswordValidation {

    // Methode passwordGreater7 stellt sicher, dass das Passwort mindestens 8 Zeichen lang ist.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 8 Zeichen hat
    public static boolean passwordGreater7(String password) {
        if(password.length()>7){
            return true;
        }
        return false;
    }


    // Methode containNumbers prüft, ob das Passwort Ziffern enthält.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 1 Ziffer enthält


    // Methode lowerAndUpperCaseLetters stellt sicher, dass Groß- und auch Kleinbuchstaben verwendet werden.
    // @param password
    // @return boolean true, wenn das Passwort mindestens 1 Groß- und auch Kleinbuchstaben enthält


    // Methode badPassword prüft, ob das Passwort zu üblich und zu einfach ist.
    // @param password
    // @return boolean true, wenn das Passwort nicht ein übliches Passwort ist



}
