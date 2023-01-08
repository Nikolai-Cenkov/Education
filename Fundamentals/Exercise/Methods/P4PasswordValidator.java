package Exercise.Methods;

import java.util.Scanner;

public class P4PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        boolean passWordLengthValid = passWordLength(password);
        if (!passWordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean passConsist = consistPass(password);
        if (!passConsist){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean passDigits = countDigits(password);
            if (!passDigits){
                System.out.println("Password must have at least 2 digits");
            }
            if (passWordLengthValid && passConsist && passDigits){
                System.out.println("Password is valid");
            }
        }

        //1.Input
        //2.We check length of the password
        //2.We check what is her consist.
        //3.We check, what is count of entered password.

    public static boolean passWordLength(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean consistPass(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    public static boolean countDigits(String password) {
        int digits = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digits++;

            }
        }
        return digits >= 2;
    }


}
