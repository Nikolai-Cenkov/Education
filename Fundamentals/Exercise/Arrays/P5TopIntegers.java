package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P5TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        //Write a program to find all the top integers in an array. A top integer is an integer that is bigger than all the elements to its right.
        //1 4 3 2 -> 4 3 2

        for (int index = 0; index < numbers.length; index++) {
            int currentNumber = numbers[index];
            if (index == numbers.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }
            boolean isTop = false;
            for (int i = index + 1; i <= numbers.length - 1; i++) {
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop){
                System.out.print(currentNumber + " ");
            }
        }

    }
}
