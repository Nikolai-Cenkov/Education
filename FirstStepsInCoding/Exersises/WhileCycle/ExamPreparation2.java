package FirstStepsInCoding.Exersises.WhileCycle;

import java.util.Scanner;

public class ExamPreparation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int unsatisfactoryRating = Integer.parseInt(scanner.nextLine());
        int poorRating = 0;
        double goodRating = 0;
        int numperProblems = 0;
        String lastProblem = "";


        String taskName = scanner.nextLine();
        while (!taskName.equals("Enough")) {
            int rating = Integer.parseInt(scanner.nextLine());
            if (rating <= 4) {
                poorRating++;
            }
            if (poorRating >= unsatisfactoryRating) {
                System.out.printf("You need a break, %d poor grades.", poorRating);
                return;

            } else {
                goodRating += rating;

            }
            lastProblem = taskName;
            numperProblems++;
            taskName = scanner.nextLine();
        }
        System.out.printf("Average score: %.2f%n", goodRating / numperProblems);
        System.out.printf("Number of problems: %d%n", numperProblems);
        System.out.printf("Last problem: %s", lastProblem);
    }
}
