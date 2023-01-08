package FirstStepsInCoding.Lab.WhileCycleLesson5;

import java.util.Scanner;

public class AccountBalance5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = 0;

        String input = scanner.nextLine();

        while (!input.equals("NoMoreMoney")) {
            double currentSum = Double.parseDouble(input);
            if (currentSum < 0) {
                System.out.println("Invalid operation!");
                break;

            } else {
                amount += currentSum;
                System.out.printf("Increase: %.2f\n", currentSum);
            }
            input = scanner.nextLine();

        }
        System.out.printf("Total: %.2f\n", amount);

    }
}


