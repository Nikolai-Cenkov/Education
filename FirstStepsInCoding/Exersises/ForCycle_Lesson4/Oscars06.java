package FirstStepsInCoding.Exersises.ForCycle_Lesson4;

import java.util.Scanner;

public class Oscars06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            int length = juryName.length();

            points = points + (length * juryPoints) / 2;
            if (points >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }
        }
        if (points < 1250.5) {
            System.out.printf("Sorry, %s you need %.1f more!", actor, 1250.5 - points);
        }
    }

}






