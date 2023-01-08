package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class NewHouse3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flower = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price = 0.0;

        switch (flower) {
            case "Roses":
                price = 5;
                if (count > 80) {
                    price = price - (price * 0.1);
                }
                break;
            case "Dahlias":
                price = 3.8;
                if (count > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = 2.80;
                if (count > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = 3;
                if (count < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = 2.50;
                if (count < 80) {
                    price = price + (price * 0.20);
                }
                break;
        }
        double finalPrice = price * count;
        if (budget >= finalPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flower, Math.abs(finalPrice - budget));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(finalPrice - budget));
        }

    }
}
