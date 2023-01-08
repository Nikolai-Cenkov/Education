package FirstStepsInCoding.Lab.ForCycleLesson4;

import java.util.Scanner;

public class LeftandRightSum09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int sum1 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum1 += number;
        }
        if (sum == sum1){
            System.out.printf("Yes, sum = %d", sum1);
        }else {
            System.out.printf(" No, diff = %d", Math.abs(sum - sum1));
        }

    }

}
