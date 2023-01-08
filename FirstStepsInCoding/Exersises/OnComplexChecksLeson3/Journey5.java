package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class Journey5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;
        String type = "";
        String destination = "";

        if (budget <= 100){
            destination = "Bulgaria";

            if (season.equals("summer")){
                price = budget * 0.30;
                type = "Camp";
            }else {
                price = budget * 0.70;
                type = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Balkans";

            if (season.equals("summer")) {
                price = budget * 0.40;
                type = "Camp";
            } else {
                price = budget * 0.80;
                type = "Hotel";
            }
        } else  {
            destination = "Europe";
            price = budget * 0.90;
            type = "Hotel";
        }
        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", type,price);







    }
}
