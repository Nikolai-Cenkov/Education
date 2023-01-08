package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class SeriesCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String nameSerial = scanner.nextLine();
        int seasonCount = Integer.parseInt(scanner.nextLine());
        int episodeCount = Integer.parseInt(scanner.nextLine());
        double episode = Double.parseDouble(scanner.nextLine());

        double advertise = episode * 0.2;
        double episodeWIthAd = advertise + episode;
        double specTime = seasonCount * 10;
        double allTime = episodeWIthAd * episodeCount * seasonCount + specTime;
        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameSerial, Math.floor(allTime));
    }
}
