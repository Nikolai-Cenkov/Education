package Exercise.DataTypesAndVariables;

import java.util.Scanner;

public class P2SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //You will be given a single integer. Your task is to find the sum of its digits.
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num = num / 10;

        }
            System.out.println(sum);
    }
}
