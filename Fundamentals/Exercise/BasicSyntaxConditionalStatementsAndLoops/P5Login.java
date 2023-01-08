package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P5Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String password = "";

        for (int position = userName.length() - 1; position >= 0; position--) {
            char currentSymbol = userName.charAt(position);
            password += currentSymbol;
        }

        String enteredPassword = scanner.nextLine();
        int failedTry = 0;
        while (!enteredPassword.equals(password)) {
            failedTry++;
            if (failedTry == 4) {
                System.out.printf("User %s blocked!", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPassword = scanner.nextLine();
        }
        if (enteredPassword.equals(password)) {
            System.out.printf("User %s logged in.", userName);
        }

    }
}

