package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class ToyShop2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTour = Double.parseDouble(scanner.nextLine());
        // 	Пъзел - 2.60 лв.
        // Говореща кукла - 3 лв.
        //	Плюшено мече - 4.10 лв.
        //Миньон - 8.20 лв.
        //Камионче - 2 лв.

        int puzle = Integer.parseInt(scanner.nextLine());
        int doll = Integer.parseInt(scanner.nextLine());
        int bear = Integer.parseInt(scanner.nextLine());
        int minion = Integer.parseInt(scanner.nextLine());
        int truck = Integer.parseInt(scanner.nextLine());

        double totalSum = puzle * 2.60 + doll * 3 + bear * 4.10 + minion  * 8.20 + truck * 2;
        int toyCount = puzle + doll + bear + minion + truck;
        if (toyCount >= 50) {
            totalSum = totalSum - (totalSum * 0.25);
        }
        totalSum = totalSum - (totalSum * 0.1);
        if (totalSum > priceTour) {
            System.out.printf("Yes! %.2f lv left.", totalSum - priceTour);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalSum - priceTour));
        }

    }
}
