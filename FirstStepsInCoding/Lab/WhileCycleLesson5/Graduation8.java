package FirstStepsInCoding.Lab.WhileCycleLesson5;

import java.util.Scanner;

public class Graduation8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int countGrade = 0;
        int poorEvaluation = 0;
        double goodEvaluation = 0;
        int numberGrade = 1;


        while (countGrade < 12) {
            if (poorEvaluation == 2)
                break;

            double evaluation = Double.parseDouble(scanner.nextLine());
            if (evaluation < 4) {
                poorEvaluation++;
                continue;
            }
            goodEvaluation += evaluation;
            countGrade++;
            numberGrade++;
        }
        double avrValue = goodEvaluation / countGrade;
        if (countGrade >= 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, avrValue);
        }else {
            System.out.printf("%s has been excluded at %d grade", name, numberGrade);
        }
    }
}