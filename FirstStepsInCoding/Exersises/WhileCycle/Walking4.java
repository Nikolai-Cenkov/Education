package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class Walking4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targer = 10000;
        int steps = 0;

        while (steps < targer) {
            String input = scanner.nextLine();
            if (input.equals("Going home")) {
                steps += Integer.parseInt(scanner.nextLine());
                break;
            }
            steps += Integer.parseInt(input);

        }
        if (steps >= targer) {
            System.out.printf("Goal reached! Good job!%n" + "%d steps over the goal!\n", steps - targer);
        }else {
            System.out.printf("%d more steps to reach goal.", targer - steps);
        }


    }
}
