package Exercise.DataTypesAndVariables;

import java.util.Scanner;

public class P1IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read four integer numbers. Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result.
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        int num5 = num1 + num2;
        int num6 = num5 / num3;
        int num7 = num6 * num4;
        System.out.println(num7);
    }
}
