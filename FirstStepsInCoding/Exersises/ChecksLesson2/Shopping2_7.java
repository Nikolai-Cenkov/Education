package FirstStepsInCoding.Exersises.ChecksLesson2;

import java.util.Scanner;

public class Shopping2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //	Видеокарта – 250 лв./бр.
        //Процесор – 35% от цената на закупените видеокарти/бр.
        // Рам памет – 10% от цената на закупените видеокарти/бр.
        double budget = Double.parseDouble(scanner.nextLine());
        int video = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double videoPrice = video * 250;
        double cpuPrice = (videoPrice * 0.35) * cpu;
        double ramPrice = (videoPrice * 0.1) * ram;
        double finalPrice = 0;
        if (video > cpu) {
            finalPrice = (videoPrice + cpuPrice + ramPrice) * 0.85;
        } else {
            finalPrice = videoPrice + cpuPrice + ramPrice;

        }
        double diff = Math.abs(finalPrice - budget);
        if (budget >= finalPrice) {
            System.out.printf("You have %.2f leva left!", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", diff);


        }
    }
}