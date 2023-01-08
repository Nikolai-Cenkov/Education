package Lab.TextProcessing;

import java.util.Scanner;

public class P2RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : text){
            int count = word.length();
            for (int i = 0; i < count ; i++) {
                result.append(word);
            }
        }
            System.out.print(result);
    }
}
