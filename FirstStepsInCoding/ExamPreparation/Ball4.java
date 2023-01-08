package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class Ball4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBall = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int red = 0;
        int orange = 0;
        int yellow = 0;
        int white = 0;
        int black = 0;
        int diffBalls = 0;

        for (int i = 1; i <= countBall; i++) {
            String colorBall = scanner.nextLine();
            switch (colorBall) {
                case "red":
                    red++;
                    points += 5;
                    break;
                case "orange":
                    orange++;
                    points += 10;
                    break;
                case "yellow":
                    yellow++;
                    points += 15;
                    break;
                case "white":
                    white++;
                    points += 20;
                    break;
                case "black":
                    black++;
                    points = points / 2;
                    break;
                default:
                    diffBalls++;
                    break;


            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", red);
        System.out.printf("Orange balls: %d%n", orange);
        System.out.printf("Yellow balls: %d%n", yellow);
        System.out.printf("White balls: %d%n", white);
        System.out.printf("Other colors picked: %d%n", diffBalls);
        System.out.printf("Divides from black balls: %d", black);

    }
}
