package com.start;

import java.util.Scanner;

public class PasswordValidator {

    private static String currentUsername = "johndoe";
    private static String currentPassword = "ABC_1234";

    public static void main(String[] args) {
        printPasswordRules();
        Scanner scanner = new Scanner(System.in);
        boolean valid;

        do {
            System.out.println("Enter new password : ");
            var proposedPassword = scanner.nextLine();
            valid = changePassword(proposedPassword);
        } while (!valid);

        System.out.println("The proposed password is valid");
        scanner.close();
    }

    private static boolean changePassword(String newPassword) {
        boolean valid = true;
        String errorMessage="";
        //check for length
        if (newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be 8 characters long";
        }
        //check for uppercase character presence
        if (newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must contain at least one uppercase character";
        }
        //check for specialcase character presence
        if (newPassword.matches("[a-zA-Z0-9]*"))
        {
            valid = false;
            errorMessage += "\n Your password must contain at least one special character";
        }
        // Check for match with old password
        if (newPassword.toUpperCase().contains(currentUsername.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password can not contain your username " + currentUsername;
        }
        // Check for match with new password and current password
        if (newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password must be different from the current password";
        }

        if (!valid)
            System.out.println(errorMessage);

        return true;
    }

    private static void printPasswordRules() {
        System.out.println("Your password mus meet following requirements : ");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password \n");

    }
}
