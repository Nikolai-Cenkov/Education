package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P1Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagon = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[countWagon];
        for (int wagon = 0; wagon < countWagon; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = countPeople;

        }
        int sum = 0;
        for (int i = 0; i < wagons.length; i++) {
            System.out.print(wagons[i] + " ");
            sum += wagons[i];

        }
        System.out.println();
        System.out.println(sum);

    }
}
