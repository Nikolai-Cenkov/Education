package Exercise.Methods;

import java.util.Scanner;

public class P7NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        integerMatrix(number);

    }
    public static void integerMatrix(int number){
        for (int i = 1; i <= number ; i++) {
            if (i > 1)
            System.out.println();
            for (int j = 1; j <= number ; j++) {
                System.out.print(number + " ");
            }
        }
    }
}
