package FirstStepsInCoding.Lab.NestedLoops;

import java.util.Scanner;

public class SumofTwoNumbers4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        boolean isFound = false;

        int count = 0;

        for (int i = beginning; i <= ending; i++) {
            for (int j = beginning; j <= ending; j++) {
                count++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    isFound = true;
                }

            }
            if (isFound) {
                break;
            }
        }
        if (!isFound) {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNumber);
        }
    }
}






