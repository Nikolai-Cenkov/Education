package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class SummerOutfit2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degreece = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        switch (time) {
            case "Morning":
                if (degreece >= 10 && degreece <= 18) {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";

                } else if (degreece >= 18 && degreece <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreece >= 25) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                break;

            case "Afternoon":
                if (degreece >= 10 && degreece <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";

                } else if (degreece >= 18 && degreece <= 24) {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degreece >= 25) {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                break;

            case "Evening":
                if (degreece >= 10 && degreece <= 18) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreece >= 18 && degreece <= 24) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreece >= 25) {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degreece, outfit, shoes);
    }
}
