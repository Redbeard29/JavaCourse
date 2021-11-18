package chapter7;

import java.util.Scanner;

public class PasswordValidator {

    private String username;
    private String currentPassword;

    private boolean valid;
    private String errorMessage;

    public static Scanner scanner = new Scanner(System.in);

    public PasswordValidator(String username, String currentPassword){
        this.username = username;
        this.currentPassword = currentPassword;
    }

    public boolean isValid(){
        return valid;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public void closeScanner(){
        scanner.close();
    }

    public static PasswordValidator login(){
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();

        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        return new PasswordValidator(username, password);
    }

    public void printPasswordRules(){
        System.out.println("Your new password must meet the follow criteria:");
        System.out.println("* It is at least 8 characters long");
        System.out.println("* It contains an uppercase letter");
        System.out.println("* It contains a special character");
        System.out.println("* It does not contain your username");
        System.out.println("* It is not the same as a previous password");
        System.out.println();
    }

    public String getNewPassword(){
        System.out.println("Enter your new password: ");
        return scanner.nextLine();
    }

    public void updatePassword(String newPassword){
        valid = true;
        errorMessage = "";

        if(newPassword.length() < 8){
            valid = false;
            errorMessage += "\n Your password must be at least 8 characters.";
        }

        if(newPassword.equals(newPassword.toLowerCase())){
            valid = false;
            errorMessage += "\n Your password must contain an uppercase letter.";
        }

        if(newPassword.matches("^[a-zA-Z0-9]*")){
            valid = false;
            errorMessage += "\n Your password must contain a special character.";
        }

        if(newPassword.toUpperCase().contains(username.toUpperCase())){
            valid = false;
            errorMessage += "\n Your password cannot contain your username";
        }

        if(newPassword.equals(currentPassword)){
            valid = false;
            errorMessage += "\n Your password cannot be the same as a previous password";
        }

    }

    public static void main(String[] args){
        var validator = login();

        validator.printPasswordRules();

        do{
            var newPassword = validator.getNewPassword();
            validator.updatePassword(newPassword);

            if(!validator.isValid()){
                System.out.println(validator.getErrorMessage());
            }

        }while(!validator.isValid());

        System.out.println("Password is valid");

        validator.closeScanner();
    }

}
