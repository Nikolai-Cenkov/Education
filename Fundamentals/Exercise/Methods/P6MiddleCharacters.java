package Exercise.Methods;

import java.util.Scanner;

public class P6MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        middleCharacter(input);

    }

    public static void middleCharacter(String input) {
        if (input.length() % 2 == 1) {
            int oddCharacter = input.length() / 2;
            System.out.println(input.charAt(oddCharacter));
        } else {
            int middleFirstCharacter = input.length() / 2 - 1;
            int middleSecondCharacter = input.length() / 2;
            System.out.println("" + input.charAt(middleFirstCharacter) +  input.charAt(middleSecondCharacter));
        }
    }
}
