package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class DepositCalculator1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     double deposit = Double.parseDouble(scanner.nextLine());
     int mounts = Integer.parseInt(scanner.nextLine());
     double percent = Double.parseDouble(scanner.nextLine());
     double total = deposit + mounts *((deposit * percent / 100) / 12);
        System.out.println(total);




    }
}
