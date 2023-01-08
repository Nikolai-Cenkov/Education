package FirstStepsInCoding.Lab.FirstStepsInProgramindLesson1;

import java.util.Scanner;

public class ProjectsCreation1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int needTime = count * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, needTime, count);




    }
}
