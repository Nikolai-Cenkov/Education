package Exercise.Methods;

import java.util.Scanner;

public class P1SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1.We have to make input.
        //2. We make the method.
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        smallestNumber(num1, num2, num3);
    }

    public static void smallestNumber(int n1, int n2, int n3) {
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }

    }

}
