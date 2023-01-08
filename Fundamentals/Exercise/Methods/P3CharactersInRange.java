package Exercise.Methods;

import java.util.Scanner;

public class P3CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a method that receives two characters and prints all the characters in between them on a single line according to ASCII.
        //1.Input
        //2.Method
        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);
        asciiSymbol(symbol1,symbol2);

    }

    public static void asciiSymbol(char symbol1, char symbol2) {
        if (symbol1 < symbol2) {
            for (char symbol = (char) (symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");

            }
        }else if (symbol2 < symbol1){
            for (char symbol = (char)(symbol2 + 1); symbol < symbol1 ; ++symbol) {
                System.out.print(symbol + " ");

            }
        }
    }

}
