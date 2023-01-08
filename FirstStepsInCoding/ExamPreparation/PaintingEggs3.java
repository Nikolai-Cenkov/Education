package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class PaintingEggs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sizeEggs = scanner.nextLine();
        String colorEggs = scanner.nextLine();
        int countEggs = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (sizeEggs.equals("Large")) {
            if (colorEggs.equals("Red")) {
                price = 16;
            } else if (colorEggs.equals("Green")) {
                price = 12;
            } else if (colorEggs.equals("Yellow")) {
                price = 9;
            }
        }
        if (sizeEggs.equals("Medium")) {
            if (colorEggs.equals("Red")) {
                price = 13;
            } else if (colorEggs.equals("Green")) {
                price = 9;
            } else if (colorEggs.equals("Yellow")) {
                price = 7;
            }
        }
        if (sizeEggs.equals("Small")) {
            if (colorEggs.equals("Red")) {
                price = 9;
            } else if (colorEggs.equals("Green")) {
                price = 8;
            } else if (colorEggs.equals("Yellow")) {
                price = 5;
            }
        }
        double eggPrice = price * countEggs;
        double finalPrice = eggPrice * 0.65;
        System.out.printf("%.2f leva.", finalPrice);
    }
}
