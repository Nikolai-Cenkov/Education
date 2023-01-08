package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class SkiTrip9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String assessment = scanner.nextLine();
//	"room for one person" – 18.00 лв за нощувка
//	"apartment" – 25.00 лв за нощувка
//	"president apartment" – 35.00 лв за нощувка
        double price = 0.0;
        int night = day - 1;
        switch (room) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                price = 25;
                if (day < 10) {
                    price = price - price * 0.30;
                } else if (day > 10 && day <= 15) {
                    price = price - price * 0.35;
                } else {
                    price = price - price * 0.50;
                }
                break;
            case "president apartment":
                price = 35;
                if (day < 10) {
                    price = price - price * 0.10;
                } else if (day > 10 && day <= 15) {
                    price = price - price * 0.15;
                } else {
                    price = price - price * 0.20;
                }
                break;
        }
        if (assessment.equals("positive")) {
            price = price + price * 0.25;
        } else if (assessment.equals("negative")) {
            price = price - price * 0.10;
        }
        System.out.printf("%.2f", night * price);


    }
}
