package bootcamp.neuefische;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Generiert ein zufälliges Passwort mit den Vorgaben
        RandomPassword.generatePassword();


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