package FirstStepsInCoding.Exersises.FirstStepsInProgramindLesson1;


import java.util.Scanner;

public class VacationBooksList1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int allHours = pages / pagesForHour;
        int hoursforDay = allHours / days;
        System.out.println(hoursforDay);

    }

    }

