package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class GodzillaVvsKong2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statis = Integer.parseInt(scanner.nextLine());
        double clothesPrice = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double statisClothesPrice = statis * clothesPrice;
        if (statis > 150) {
            statisClothesPrice = statisClothesPrice - (statisClothesPrice * 0.1);
        }
        double totalPrice = decorPrice + statisClothesPrice;
        if (budget >= totalPrice) {
            System.out.println("Action");
            System.out.printf("Wingard starts filming with %.2f leva left.",budget - totalPrice);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(budget - totalPrice));
        }

    }
}

