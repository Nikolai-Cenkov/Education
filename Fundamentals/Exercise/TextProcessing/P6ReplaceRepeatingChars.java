package Exercise.TextProcessing;

import java.util.Scanner;

public class P6ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String symbols = "";
        char firstSymbol = input.charAt(0);
        symbols += firstSymbol;

        for (int i = 1; i < input.length() ; i++) {
            char currentSymbol = input.charAt(i);
            if (currentSymbol != firstSymbol){
                symbols += currentSymbol;
                firstSymbol = currentSymbol;
            }
        }
        System.out.println(symbols);



    }
}
