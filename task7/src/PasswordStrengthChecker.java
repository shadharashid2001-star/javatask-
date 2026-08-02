
import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main(String[] args){

        // create scanner
        Scanner input = new Scanner(System.in);
        //string variable
        String password ;
        System.out.println("enter your password");
        password = input.nextLine();

        //check pasword is empty
        if (password.length()<=0){
            System.out.println("Invalid password.");
        }else {
            System.out.println("Password entered successfully.");
            System.out.println("Password length: " + password.length());
        }
        int choice;
        do {
            System.out.println("1.Enter Password");
            System.out.println("2.Check Password Length");
            System.out.println("3.Analyze Password Characters");
            System.out.println("4.Check Password Strength");
            System.out.println("5.Convert Password Format");
            System.out.println("6. Display Password Report");
            System.out.println("7 . exit");
            System.out.println("enter choice");
            choice = input.nextInt();
            input.nextLine();
            //menu

            switch (choice) {

                case 1:
                    System.out.println("Enter new Password");
                    password= input.nextLine();
                    if (password.length()<=0) {
                        System.out.println("Invalid password.");
                    }else {
                        System.out.println("Password saved successfully");}
                    break;

                case 2:
                    Integer passwordlength = password.length();
                    System.out.println(" Password Length"+passwordlength);
                    if (passwordlength<8){
                        System.out.println("Password is too short.");
                    } else {
                        System.out.println("Password length is acceptable.");
                    }
                    break;

                case 3:
                    System.out.println("Analyze Password Characters");
                    // Count password characters
                    Integer uppercase = 0;
                    Integer lowercase = 0;
                    Integer digits = 0;
                    Integer special = 0;
                    for (int i=0; i<password.length();i++){
                        char ch = password.charAt(i);
                        if (ch >= 'a' && ch <= 'z') {
                            lowercase++;
                        }
                        else if (ch >= '0' && ch <= '9') {
                            digits++;
                        }
                        else {
                            special++;
                        }
                        System.out.println("Uppercase letters: " + uppercase);
                        System.out.println("Lowercase letters: " + lowercase);
                        System.out.println("Digits: " + digits);
                        System.out.println("Special characters: " + special);

                        break;
                    }

                case 4:
                    System.out.println("Check Password Strength");
                    boolean hasUppercase = false;
                    boolean hasLowercase = false;
                    boolean hasDigit = false;
                    boolean hasSpecial = false;

                    // Analyze password characters
                    for (int i = 0; i < password.length(); i++) {

                        char ch = password.charAt(i);

                        if (ch >= 'A' && ch <= 'Z') {
                            hasUppercase = true;
                        }
                        else if (ch >= 'a' && ch <= 'z') {
                            hasLowercase = true;
                        }
                        else if (ch >= '0' && ch <= '9') {
                            hasDigit = true;
                        }
                        else {
                            hasSpecial = true;
                        }
                    }
                    // Check password strength
                    if (password.length() >= 8 && hasUppercase && hasLowercase
                            && hasDigit && hasSpecial) {

                        System.out.println("Strong Password.");

                    } else if (password.length() >= 6 && hasUppercase
                            && hasLowercase) {

                        System.out.println("Medium Password.");

                    } else {

                        System.out.println("Weak Password.");
                    }

                    break;

                case 5:
                    System.out.println("Convert Password Format");
                    System.out.println("Password in uppercase: " + password.toUpperCase());

                    System.out.println("Password in lowercase: " + password.toLowerCase());
                    break;

                case 6:

                    // Display password report
                    System.out.println("Display Password Report");
                    // Display password length
                    System.out.println("Password length: " + password.length());
                    // Display first and last character
                    System.out.println("First character: " + password.charAt(0));
                    System.out.println("Last character: " + password.charAt(password.length() - 1));
                    // Check password patterns using String methods
                    System.out.println("Contains '@': " + password.contains("@"));

                    System.out.println("Starts with 'A': " + password.startsWith("A"));

                    System.out.println("Ends with '9': " + password.endsWith("9"));

// Compare password with a sample password
                    String samplePassword = "Password123";

                    System.out.println("Equals sample password: "
                            + password.equals(samplePassword));

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

    }
}