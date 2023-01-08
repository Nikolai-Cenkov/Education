package Exercise.BasicSyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

public class P9Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrder = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        while ( countOrder > 0){
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsuleCount = Integer.parseInt(scanner.nextLine());
            double priceForCoffee = ((daysInMonth * capsuleCount) * pricePerCapsule);
            totalPrice += priceForCoffee;
            System.out.printf("The price for the coffee is: $%.2f%n", priceForCoffee );
            countOrder--;

        }
        System.out.printf("Total: $%.2f", totalPrice);
    }
}
