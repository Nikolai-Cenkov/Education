package Exercise.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P8MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //Write a program that prints all unique pairs in an array of integers whose sum is equal to a given number.
        //1 7 6 2 19 23
        //8
        //1. We have the array!
        //2. We must start to walk around the array!
        int [] number = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());
        int oldNumber = 0;
        int printSum = 0;
        for (int i = 0; i < number.length; i++) {
            oldNumber = number[i];
            for (int j = i + 1 ; j < number.length; j++) {
                int secondSum = number[j];
                printSum = oldNumber + secondSum;
                if (printSum == magicSum){
                    System.out.println(number[i] + " " + number[j]);
                }else{
                    printSum = 0;
                }
        }
        }
    }
    }

