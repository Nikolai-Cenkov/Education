package ExamPreparation22;

import java.util.Scanner;

public class P1PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        String input = scanner.nextLine();

        while (!input.equals("Done")) {
            String[] commands = input.split(" ");
            String command = commands[0];
            if (command.equals("TakeOdd")) {
                StringBuilder newPassword = new StringBuilder();
                for (int i = 1; i < password.length(); i += 2) {
                    char symbol = password.charAt(i);
                    newPassword.append(symbol);
                }
                password = newPassword.toString();
                System.out.println(password);

            } else if (command.equals("Cut")) {
                String substring = "";
                int index = Integer.parseInt(commands[1]);
                int length = Integer.parseInt(commands[2]);
                substring = password.substring(index, index + length);
                password = password.replace(substring,"");
                System.out.println(password);

            } else if (command.equals("Substitute")) {
                String replaceSymbol = commands[1];
                String replaceWith = commands[2];
                if (password.contains(replaceSymbol)) {
                    password = password.replaceAll(replaceSymbol, replaceWith);
                    System.out.println(password);
                } else {
                    System.out.println("Nothing to replace!");
                }

            }
            input = scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
