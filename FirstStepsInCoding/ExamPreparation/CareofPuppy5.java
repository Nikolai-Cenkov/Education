package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class CareofPuppy5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        int foodInGram = food * 1000;
        String command = scanner.nextLine();
        int allFood = 0;

        while (!command.equals("Adopted")){
            int ateFood = Integer.parseInt(command);
            allFood += ateFood;
            command = scanner.nextLine();
        }
        int diff = Math.abs(allFood - foodInGram);
        if (allFood <= foodInGram){
            System.out.printf("Food is enough! Leftovers: %d grams.",diff);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.",diff
            );

        }
    }
}
