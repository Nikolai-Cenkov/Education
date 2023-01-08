package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class SuppliesForSchool1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());
        double penPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = 4 * 1.20;
        double total = penPrice + markersPrice + cleanerPrice;
        double priceAfterDiscount = total - (total * discount / 100);
        System.out.println(priceAfterDiscount);


    }
}
