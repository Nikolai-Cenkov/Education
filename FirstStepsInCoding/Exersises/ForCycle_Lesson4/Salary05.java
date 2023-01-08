package FirstStepsInCoding.Exersises.ForCycle_Lesson4;

import java.util.Scanner;

public class Salary05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tab = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= tab; i++) {
            String penalty = scanner.nextLine();
            if ("Facebook".equals(penalty)) {
                salary -= 150;
            } else if ("Instagram".equals(penalty)) {
                salary -= 100;
            } else if ("Reddit".equals(penalty)) {
                salary -= 50;
            }
            if (salary <= 0) {
                System.out.println("You have lost your salary.");
                break;

            }


        }
        if (salary > 0) {
            System.out.println(salary);

        }
    }
}
