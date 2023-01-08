package FirstStepsInCoding.Lab.WhileCycleLesson5;

import java.util.Scanner;

public class MaxNumber6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int number = Integer.parseInt(input);
            if (maxNumber < number) {
                maxNumber = number;
            }
                input = scanner.nextLine();

            }
            System.out.println(maxNumber);
        }
    }

