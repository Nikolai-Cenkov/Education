package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class FishTank1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int lentht = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        int volumeSm = lentht * width * high;
        double volumeDm = volumeSm / 1000.00;
        double needWater = volumeDm * (1-percent / 100);
        System.out.println(needWater);

    }
}
