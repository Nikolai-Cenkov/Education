package Exercise.Methods;

import java.util.Scanner;

public class P5AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());
        sumOfNumbers(number1, number2);
        int finalAmount = sumOfNumbers(number1 , number2) -  number3;
        System.out.println(finalAmount);

    }
    public static Integer sumOfNumbers (int num1, int num2){
    return num1 + num2;
    }

    }





