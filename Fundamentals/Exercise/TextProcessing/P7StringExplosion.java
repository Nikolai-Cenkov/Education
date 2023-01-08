package Exercise.TextProcessing;

import java.util.Scanner;

public class P7StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder inputLine = new StringBuilder(input);

        int bombStrength = 0;
        for (int i = 0; i <= inputLine.length() - 1; i++) {
            char currentSymbol = inputLine.charAt(i);
            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt(inputLine.charAt(i + 1) + "");
                bombStrength += explosionStrength;

            } else if (currentSymbol != '>' && bombStrength > 0) {
                inputLine.deleteCharAt(i);
                bombStrength--;
                i--;
            }
        }
        System.out.println(inputLine);


    }
}

