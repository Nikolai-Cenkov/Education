package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P9ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You are given an array with integers. Write a program to modify the elements after receiving the following commands:
        //•	"swap {index1} {index2}" takes two elements and swap their places.
        //•	"multiply {index1} {index2}" takes the element at the 1st index and multiplies it with the element at 2nd index. Save the product at the 1st index.
        //•	"decrease" decreases all elements in the array with 1.


        //Input:
        //On the first input line, you will be given the initial array values separated by a single space.
        //On the next lines, you will receive commands until you receive the command "end". The commands are as follows:
        //•	"swap {index1} {index2}"
        //•	"multiply {index1} {index2}"
        //•	"decrease"

        //Output
        //The output should be printed on the console and consist of elements of the modified array – separated by a comma and a single space ", ".
        //Constraints
        //•	Elements of the array will be integer numbers in the range [-231...231].
        //•	The count of the array elements will be in the range [2...100].
        //•	Indexes will always be in the range of the array.

        //23 -2 321 87 42 90 -123
        //swap 1 3
        //swap 3 6
        //swap 1 0
        //multiply 1 2
        //multiply 2 1
        //decrease
        //end

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                int element1 = numbersArr[index1];
                int element2 = numbersArr[index2];
                numbersArr[index1] = element2;
                numbersArr[index2] = element1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split(" ")[1]);
                int index2 = Integer.parseInt(command.split(" ")[2]);
                numbersArr[index1] = numbersArr[index1] * numbersArr[index2];

            } else if (command.equals("decrease")) {
                for (int i = 0; i <= numbersArr.length - 1; i++) {
                    int number = numbersArr[i];
                    numbersArr[i] = number - 1;
                }

            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            int currentNumber = numbersArr[i];
            if (i < numbersArr.length - 1) {
                System.out.print(currentNumber + ", ");
            }else {
                System.out.print(currentNumber);
            }
        }
    }
}
