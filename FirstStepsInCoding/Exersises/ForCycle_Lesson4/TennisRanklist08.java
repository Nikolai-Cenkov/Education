package FirstStepsInCoding.Exersises.ForCycle_Lesson4;

import java.util.Scanner;

public class TennisRanklist08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournament = Integer.parseInt(scanner.nextLine());
        int firstPoints = Integer.parseInt(scanner.nextLine());
        int tournamentPoints = 0;
        int w = 0;


        for (int i = 0; i < tournament; i++) {
            String result = scanner.nextLine();
            switch (result) {
                case "W":
                    tournamentPoints += 2000;
                    w++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    break;

                case "SF":
                    tournamentPoints += 720;
                    break;

            }
        }
        int finalPoints = tournamentPoints + firstPoints;
        int average = tournamentPoints / tournament;
        double wins = (1.00 * w / tournament) * 100;

        System.out.printf("Final points: %d%n", finalPoints);
        System.out.printf("Average points: %d%n", average);
        System.out.printf("%.2f%%", wins);
    }

}

