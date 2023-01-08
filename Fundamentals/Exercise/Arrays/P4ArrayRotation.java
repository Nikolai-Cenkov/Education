package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P4ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int rotations = Integer.parseInt(scanner.nextLine());

        for (int rot = 1; rot <= rotations ; rot++) {
            int firstElement = numbers[0]; // First element
            for (int index = 0; index < numbers.length - 1 ; index++) { // Move numbers of arrays to left!
                numbers[index] = numbers[index + 1];// Move the first element to the last position!

            }
            numbers[numbers.length - 1] = firstElement;


        }
        for ( int nums : numbers){
            System.out.print(nums + " ");
        }
    }
}
