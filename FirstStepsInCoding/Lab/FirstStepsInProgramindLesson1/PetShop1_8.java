package FirstStepsInCoding.Lab.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class PetShop1_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int dogsFood = Integer.parseInt(scanner.nextLine());
     int catFood = Integer.parseInt(scanner.nextLine());
    double dogPrice = dogsFood * 2.5;
    double catPrice = catFood * 4;
    double total = dogPrice + catPrice;
        System.out.println(total + "lv.");





    }
}
