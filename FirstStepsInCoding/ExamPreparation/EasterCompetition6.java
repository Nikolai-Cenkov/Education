package FirstStepsInCoding.ExamPreparation;

import java.util.Scanner;

public class EasterCompetition6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBread = Integer.parseInt(scanner.nextLine());
        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 1; i <= countBread; i++) {
            String nameBaker = scanner.nextLine();
            int totalPoints = 0;
            String input = scanner.nextLine();
            while (!input.equals("Stop")){
                int currentPoint = Integer.parseInt(input);
                totalPoints += currentPoint;

                input = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", nameBaker, totalPoints);

            if (totalPoints > maxPoints){
                maxPoints = totalPoints;
                System.out.printf(" %s is the new number 1!%n", nameBaker);
                winner = nameBaker;
            }

        }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);



    }
}
