package Exercise.Methods;

import java.util.Scanner;

public class P8FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());


        long fact1 = factorialNumber(number1);
        long fact2 = factorialNumber(number2);
        double finalResult = fact1 * 1.00 / fact2;
        System.out.printf("%.2f", finalResult);
    }

    public static long factorialNumber(int num1) {
        long factorial = 1;

        for (long i = 1; i <= num1; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }
}

