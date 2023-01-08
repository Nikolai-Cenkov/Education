package FirstStepsInCoding.Lab.NestedLoops;

import java.util.Scanner;

public class Traveling5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double money = 0;
            while (money < minBudget) {
                money += Double.parseDouble(scanner.nextLine());
            }
            System.out.println("Going to " + input + "!");
            input = scanner.nextLine();

        }
    }
}
