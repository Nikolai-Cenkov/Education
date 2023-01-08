package FirstStepsInCoding.Exersises.ForCycle_Lesson4;

import java.util.Scanner;

public class TrekkingMania07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroup = Integer.parseInt(scanner.nextLine());
        double musala = 0;
        double monbaln = 0;
        double kilimandjaro = 0;
        double k2 = 0;
        double everest = 0;
        double total = 0;



        for (int i = 0; i < countGroup; i++) {
            int group = Integer.parseInt(scanner.nextLine());
            total += group;

            if (group < 6) {
                musala += group;
            } else if (group <= 12) {
                monbaln += group;
            } else if (group <= 25) {
                kilimandjaro += group;
            } else if (group <= 40) {
                k2 += group;
            } else {
                everest += group;
            }
        }
        double musalaPercent = musala / total * 100;
        double monbalnPercent = monbaln / total * 100;
        double kilimandjaroPercent = kilimandjaro / total * 100;
        double k2Percent = k2 / total * 100;
        double everestPercent = everest / total * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monbalnPercent);
        System.out.printf("%.2f%%%n", kilimandjaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%%n", everestPercent);
    }

}
