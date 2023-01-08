package FirstStepsInCoding.Lab.OnComplexChecksLesson3;

import java.util.Scanner;

public class WorkingHours7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int workTime = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        switch (day) {
            case "Monday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                }
                break;
            case "Tuesday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");

                }
                break;
            case "Wednesday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");

                }
                break;
            case "Thursday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");
                    break;
                }
                break;
            case "Friday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");

                }
                break;
            case "Saturday":
                if (workTime >= 10 && workTime <= 18) {
                    System.out.println("open");
                } else {
                    System.out.println("closed");

                }
                break;
            case "Sunday":
                System.out.println("closed");
                break;
        }


    }
}

