package Exercise.Arrays;

import java.util.Scanner;

public class P3ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that creates 2 arrays. You will be given an integer n. On the next n lines, you get 2 integers. Form 2 arrays as shown below.
        //4
        //1 5
        //9 10
        //31 81
        //41 20
        //->1 10 31 20
        //  5 9 81 41

        int rows = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int row = 1; row <= rows; row++) {
            String[] numbers = scanner.nextLine().split(" ");
            String firsNumber = numbers[0];
            String secondNumber = numbers[1];

            if (row % 2 == 0) {
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firsNumber;
// secondArray[row - 1] = firstNumber;

            }else {
                firstArray[row - 1] = firsNumber;
                secondArray[row - 1]= secondNumber;
            }

        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));
    }
}
