package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P7MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2 1 1 2 3 3 2 2 2 1
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int length = 1;
        int maxLength = 0;
        int startIndex = 0;
        int bestIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]){
                length++;
            }else {
                length = 1;
                startIndex = i;
            }
            if (length > maxLength){
                maxLength = length;
                bestIndex = startIndex;
            }
        }
        for (int i = bestIndex; i < bestIndex + maxLength; i++) {
            System.out.print(array[i] + " ");
        }


    }
}
