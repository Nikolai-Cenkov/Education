package Exercise.Arrays;

import java.util.Scanner;

public class P2CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that prints common elements in two arrays. You have to compare the elements of the second array to the elements of the first.

        String[] firstArrays = scanner.nextLine().split(" ");
        String[] secondArrays = scanner.nextLine().split(" ");

        for (int secondElements = 0; secondElements < secondArrays.length; secondElements++) {

            for (int firstElements = 0; firstElements < firstArrays.length; firstElements++) {
                if (firstArrays[firstElements].equals(secondArrays[secondElements])) {
                    System.out.print(firstArrays[firstElements] + " ");
                    break;
                }


            }

        }
    }
}
