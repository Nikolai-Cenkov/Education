package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P11RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames / 2;
        int countMouse = lostGames / 3;
        int countKeyboard = lostGames / 6;
        int countDisplay = lostGames / 12;

        double totalPriceHeadset = headsetPrice * countHeadset;
        double totalPriceMouse = mousePrice * countMouse;
        double totalPriceKeyboard = keyboardPrice * countKeyboard;
        double totalPriceDisplay = displayPrice * countDisplay;

        double totalSum = totalPriceHeadset + totalPriceMouse + totalPriceKeyboard + totalPriceDisplay;

        System.out.printf("Rage expenses: %.2f lv.",totalSum);
    }
}
