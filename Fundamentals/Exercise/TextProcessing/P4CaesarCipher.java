package Exercise.TextProcessing;

import java.util.Scanner;

public class P4CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder encryptText = new StringBuilder();
        for (char symbol : text.toCharArray()){
            encryptText.append((char)(symbol + 3) );

        }
        System.out.print(encryptText.toString());
    }
}
