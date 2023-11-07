package bootcamp.neuefische;

import java.util.Random;

public class RandomPassword {

    // create a string of uppercase and lowercase characters, numbers and special characters
    static String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
    static String numbers = "0123456789";
    static String specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    // combine all strings
    static String alphaNumeric = upperAlphabet + lowerAlphabet + numbers + specialCharacters;

    // create random string builder
    static StringBuilder buildString = new StringBuilder();

    // create an object of Random class
    static Random random = new Random();

    public static String getRandomPassword(int length) {

        for (int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphaNumeric.length());

            // get character specified by index
            // from the string
            char randomChar = alphaNumeric.charAt(index);

            // append the character to string builder
            buildString.append(randomChar);
        }
        return buildString.toString();
    }

    public static void generatePassword() {

        //Generiert ein zufälliges Passwort
        String randomPassword = RandomPassword.getRandomPassword(8);

        //Solange eine Methode false ausgibt, also die Vorgabe nicht erfüllt ist,
        // wird für randomPassword ein neues Passswort kriert und erneut getestet
        while (!PasswordValidation.isSafe(randomPassword)) {
            randomPassword = RandomPassword.getRandomPassword(8);
        }
        System.out.println(randomPassword);
    }
}
