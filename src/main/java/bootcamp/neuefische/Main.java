package bootcamp.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generiert ein zufälliges Passwort
        String randomPassword = RandomPassword.getRandomPassword(8);

        //Solange eine Methode false ausgibt, also die Vorgabe nicht erfüllt ist,
        // wird für randomPassword ein neues Passswort kriert und erneut getestet
        while (!PasswordValidation.isSafe(randomPassword)) {
            randomPassword = RandomPassword.getRandomPassword(8);
        }
        System.out.println(randomPassword);


        //Eingabe und Überprüfung eines Passworts
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password:");
        String password = input.nextLine();

        if (!PasswordValidation.passwordGreater7(password)) {
            System.out.println("Your password must be at least 8 characters long!");
        } else if (!PasswordValidation.containNumbers(password)) {
            System.out.println("Your password must contain at least 1 number!");
        } else if (!PasswordValidation.lowerAndUpperCaseLetters(password)) {
            System.out.println("Your password must have lower and upper case letters!");
        } else if (!PasswordValidation.noCommonPassword(password)) {
            System.out.println("Your password must be special!");
        } else if (!PasswordValidation.specialCharacter(password)) {
            System.out.println("Your password must contain at least 1 special character!");
        } else {
            System.out.println("Your password was created successfully!");
        }



    }
}