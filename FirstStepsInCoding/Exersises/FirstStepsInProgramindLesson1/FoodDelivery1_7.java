
package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class FoodDelivery1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenCount = Integer.parseInt(scanner.nextLine());
        int fishCount = Integer.parseInt(scanner.nextLine());
        int vegetarianCount = Integer.parseInt(scanner.nextLine());
        double chikenPrice = chickenCount * 10.35;
        double fishPrice = fishCount * 12.40;
        double vegetarianPrice = vegetarianCount * 8.15;
        double allMenus = chikenPrice + fishPrice + vegetarianPrice;
        double dessertPrice = allMenus * (20 / 100.00);
        double totalPrice = chikenPrice + fishPrice + vegetarianPrice + dessertPrice + 2.50;
        System.out.println(totalPrice);

    }
}