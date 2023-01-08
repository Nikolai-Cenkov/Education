package ExamPreparation.ExamPreparation1;

import java.util.Scanner;

public class P1GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFoodKg = Double.parseDouble(scanner.nextLine());
        double quantityHaykg = Double.parseDouble(scanner.nextLine());
        double quantityCoverkg = Double.parseDouble(scanner.nextLine());
        double guneasWeightkg = Double.parseDouble(scanner.nextLine());

        double quantityFoodGr = quantityFoodKg * 1000;
        double quantityHayGr = quantityHaykg * 1000;
        double quantityCoverGr = quantityCoverkg * 1000;
        double guneasWeightGr = guneasWeightkg * 1000;

        for (int i = 1; i <= 30; i++) {

            quantityFoodGr = quantityFoodGr - 300;
            if (i % 2 == 0) {
                quantityHayGr = quantityHayGr - (quantityFoodGr * 0.05);
            }
            if (i % 3 == 0) {
                quantityCoverGr = quantityCoverGr - (guneasWeightGr / 3);
            }



        }
        if (quantityFoodGr > 0 && quantityHayGr > 0 && quantityCoverGr > 0 && guneasWeightGr >= 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFoodGr / 1000, quantityHayGr / 1000, quantityCoverGr / 1000);
        } else {
            System.out.println("Merry must go to the pet store!");
        }

    }


}




