package FirstStepsInCoding.Lab.ForCycleLesson4;

import java.util.Scanner;

public class OddEvenSum10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sum1 += number;
            } else {
                sum2 += number;
            }


        }
        if (sum1 == sum2) {
            System.out.printf("Yes %nSum = %d", sum1);

            }else{
                System.out.printf("No %nDiff = %d", Math.abs(sum1 - sum2));
            }

            {

            }
        }
    }

