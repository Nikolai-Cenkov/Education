package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class FishingBoat4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisherman = Integer.parseInt(scanner.nextLine());
        double price = 0.0;


        switch (season) {
            case "Spring":
                price = 3000;
                break;


            case "Summer":
                price = 4200;
                break;

            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }

        if (fisherman <= 6) {
            price = price - (price * 0.10);
        } else if (fisherman >= 7 && fisherman <= 11) {
            price = price - (price * 0.15);

        } else if (fisherman >= 12) {
            price = price - (price * 0.25);
        }
        if (!season.equals("Autumn") && fisherman % 2 == 0) {
            price = price - (price * 0.05);
        }
        if (budget > price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - price));
        }
    }

}
