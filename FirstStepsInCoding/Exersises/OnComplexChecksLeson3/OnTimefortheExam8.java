package FirstStepsInCoding.Exersises.OnComplexChecksLeson3;

import java.util.Scanner;

public class OnTimefortheExam8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int hourOfArrives = Integer.parseInt(scanner.nextLine());
        int minutesOfArrives = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMinutes;
        int arriveAllMin = hourOfArrives * 60 + minutesOfArrives;
        int diff = Math.abs(examAllMin - arriveAllMin);
        int diffHour = diff / 60;
        int diffMin = diff % 60;
        if (examAllMin < arriveAllMin){
            System.out.println("Late");
            if (diffHour == 0){
                System.out.printf("%d minutes after the start", diff);
            }else {
                System.out.printf("%d:%02d hours after the start",diffHour, diffMin);
            }
        }else if (examAllMin == arriveAllMin || diff <= 30){
            System.out.println("On time");
            if (diff !=0){
                System.out.printf("%d minutes before the start", diffMin);
            }
        }else {
            System.out.println("Early");
            if (diffHour == 0){
                System.out.printf("%d minutes before the start.", diffMin);
            }else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMin);
            }
        }

    }
}
