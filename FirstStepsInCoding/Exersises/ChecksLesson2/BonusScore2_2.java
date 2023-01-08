package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class BonusScore2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (number < 100){
            bonus += 5;
        } else if (number < 1000) {
            bonus = number * 0.2;
        }else {
            bonus = number * 0.1;
        }
        if (number % 2 == 0) {
            bonus += 1;
        }
        if (number % 10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}