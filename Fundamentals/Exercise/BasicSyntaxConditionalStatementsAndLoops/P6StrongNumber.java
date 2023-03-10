package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P6StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        int factSum = 0;


        while (number > 0){
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit; i++) {
                fact = fact * i;
            }
            factSum += fact;
            number = number / 10;

        }
        if (factSum == startNumber){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
