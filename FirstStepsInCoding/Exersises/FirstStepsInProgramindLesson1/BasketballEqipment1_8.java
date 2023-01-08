package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class BasketballEqipment1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fee = Integer.parseInt(scanner.nextLine());
        double sneakersPrice = fee - (fee * 40 / 100.00);
        double outfitPrice = sneakersPrice - (sneakersPrice * 20 / 100.00);
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double totalPrice = fee + sneakersPrice + outfitPrice + ballPrice + accessoriesPrice;
        System.out.println(totalPrice);

    }
}
